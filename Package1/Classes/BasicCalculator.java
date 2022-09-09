package Classes;
import Interface.*;
public class BasicCalculator implements Calculation
{
    double val1;
    double val2;
    double result;
    public BasicCalculator()
    {
       
    }
   public BasicCalculator(double v1, double v2)
    {
       double val1=v1;
       double val2=v2;
    }
    void setVal1(double v1)
    {
        this.val1 = v1;
    }
    public double getVal1()
    {
        return val1;
    }
    void setVal2(double v2)
    {
        this.val2 = v2;
    }
    public double getVal2()
    {
        return val2;
    }
    public double add()
    {
        result = val1 + val2;
        return result;
    }
    public double subs()
    {
        result = val1 - val2;
        return result;
    }
    public double multi()
    {
        result = val1 * val2;
        return result;
    }
    public double div()
    {
        result = val1 / val2;
        return result;
    }
   
}