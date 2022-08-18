public class Box1 {

  private double length;
  private double width;
  private double height;
  
  public void setLength(double l)
  {
  length=l;
  }
   public void setWidth(double w)
  {
  width=w;
  }
  public void setHeight(double h)
  {
  height=h;
  }
  public double getLength(){return length;}
   public double getWidth(){return width;}
    public double getHeight(){return height;}
	
public static void main(String [] args){

   Box1 b=new Box1();
   b.setHeight(2.3);
    b.setLength(5.3);
	 b.setWidth(4.3);
  
  System.out.println("Length is "+b.getLength());
    System.out.println("Width is "+b.getWidth());
	  System.out.println("Height is "+b.getHeight());

}
}