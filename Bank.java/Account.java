package javaapplication3;
import java.util.*;

public abstract class Account extends java.lang.Object
{
    public String name ;
    public  int id ;
    public String dob ;
    public String nominee ;
    public double balance ;
    
    private double interest;
	
    
    public Account(String name, int id,String dob, String nominee, double balance)   
    {
        this.name = name;
        this.id = id;
        this.nominee = nominee;
        this.dob = dob;
        this.balance = balance;
    }
	
    public boolean deposite(double amount)                       
    {
        this.balance = balance + amount;
        System.out.printf("Deposited %10.2f tk\n",amount);
        return true;
        
        
        
    }
	
	
    public abstract boolean withdraw(double amount);                     
    
    
    public abstract  void calcInterest();
    
    protected void setInterest(double interest)
    {

        this.interest = interest;
    }
    
    public double getInterest()
    {
        return this.interest;
    }
    
  
    public double getCurrentBalance()
    {
        return this.balance;
    }
   
    public void printAccount()                                   
    {
        System.out.println("ID: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Date of birth: "+this.dob);
        System.out.println("Nomination Name: "+this.nominee);
        System.out.printf("Current Balance: %10.2f TK\n",getCurrentBalance());
        System.out.printf("Interest Earned: %10.2f TK\n",getInterest());
		
    }

	
	
}
