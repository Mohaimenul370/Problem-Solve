class ScientificCalculator extends BasicCalculator implements ScientificCalculation
{
    ScientificCalculator()
    {
        
    }
    ScientificCalculator(double v1,double v2)
    {
        super(v1,v2);
    }
    public double toThePow()
    {
        
        return Math.pow(super.val1,super.val2);
    }
    
}