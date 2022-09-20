/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author user
 */
public class CreditAccount extends Account
{
	private double accountLimit = 3000;
        private static double ANNUAL_INTEREST_RATE = 2;
	
	public CreditAccount(String name, int id,String dob, String nominee, double balance)
	{   
            super(name,id,dob,nominee,balance);
                
            
	}
        
	
        @Override
	public boolean withdraw(double amount)
	{
            if ((super.balance-accountLimit) > amount)
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
        if (super.getCurrentBalance()>1000)
        {
            double difference = super.getCurrentBalance()- accountLimit;
            double interest = difference*(1+((ANNUAL_INTEREST_RATE/100)/12));
            double temp = interest - difference;
            super.setInterest(temp);
            super.balance =  super.getCurrentBalance()+temp;
        }
    }
}