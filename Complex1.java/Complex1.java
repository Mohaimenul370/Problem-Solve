public class Complex1 {
   double real;
   double imag;
   
   public Complex1(double real, double imag){
   this.real = real;
   this.imag = imag;
   }
   
   public static void main(String[] args)
   { Complex1 n1 = new Complex1(2.3,4.5),
              n2 = new Complex1(3.4,5.0),
			  temp;
			  temp=add(n1,n2);
			  System.out.printf("sum = %.1f + .1fi",temp.real, temp.imag);
			  }
	public static Complex1 add(Complex1 n1, Complex1 n2)
    {
      Complex1 temp = new Complex1(0.0, 0.0);
        temp.real= n1.real + n2.real;
         temp.imag = n1.imag + n2.imag;

        return(temp);
}
}		