/*
 * To change super license header, choose License Headers in Project Properties.
 * To change super template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;



/**
 *
 * @author user
 */
public class Savings extends Account
{
	public double SAVINGS_ANNUAL_INTEREST_RATE = 8;
        
	public Savings(String name, int id,String dob, String nominee, double balance)
        {
            super(name,id,dob,nominee,balance);
           
        }
	
        
        @Override
	public boolean withdraw(double amount)
	{
            if (super.balance > amount)
            {
                super.balance = super.balance - amount;
                return true;
            }
            else
                return false;
	}
        @Override
	public void printAccount()
	{
		super.printAccount();
	}

    @Override
    public void calcInterest() {
        double newBalance = super.getCurrentBalance()*(1+((SAVINGS_ANNUAL_INTEREST_RATE/100)/12));
        double interest = newBalance-super.getCurrentBalance();
        super.setInterest(interest);
        super.balance = newBalance;
    }
}