 public abstract class Bank{
 
  abstract void getBalance();
 
 }
 
  class Bank_A extends Bank{
   void getBalance(){
   System.out.println($100);
	}
  
  }
  
  class Bank_B extends Bank{
     void getBalance(){
   System.out.println($150);
	}
    
  
  }
  class Bank_c extends Bank{
  void getBalance(){
   System.out.println($200);
	}
  
  }
  
  public class Test{
   
   public static void main(String[] args){
   
   Bank B;
   B = new Bank_A();
   B.getBalance();
  
   B = new Bank_B();
   B.getBalance();
   
   B = new Bank_C();
   C.getBalance();
   
   }
  
  
  
  }