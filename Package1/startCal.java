import Interface.*;
import Classes.*;
 
 class startCal
{
    public static void main(String[] arg)
    {
        ScientificCalculator s1= new ScientificCalculator(1,2);
        ScientificCalculator s2= new ScientificCalculator(5,6);
        System.out.println("val1="+s1.getVal1());
        System.out.println("val2="+s1.getVal2());
        System.out.println("val1="+s2.getVal1());
        System.out.println("val2="+s2.getVal2());
        System.out.println("1+2="+s1.add());
        System.out.println("1-2="+s1.subs());
        System.out.println("1*2="+s1.multi());
        System.out.println("1/2="+s1.div());
        System.out.println("1^2="+s1.toThePow());
       
        System.out.println("5+6="+s2.add());
        System.out.println("5-6="+s2.subs());
        System.out.println("5*6="+s2.multi());
        System.out.println("5/6="+s2.div());
       
        System.out.println("5^6="+s2.toThePow());
        System.out.println();
       
       
       
    }
}
 