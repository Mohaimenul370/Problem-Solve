 package Classes;
 import Interface.*;
 public class ScientificCalculator extends BasicCalculator implements ScientificCalculation
{
   public ScientificCalculator()
    {
       
    }
   public ScientificCalculator(double v1,double v2)
    {
        super(v1,v2);
    }
    public double toThePow()
    {
       
        return Math.pow(super.val1,super.val2);
    }
   
}