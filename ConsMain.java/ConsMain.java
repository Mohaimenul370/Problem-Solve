class ConsMain
       {
	    private int x;
		private ConsMain(){
		     System.out.println("constructor called");
			 x=5;
			 }
			 public static void main(String[] args){
			 ConsMain obj = new ConsMain();
			 System.out.println("value of x =" + obj.x);
			 }
			 }