class FoodItem
    {double Price;
     String Name;
      FoodItem()
         {
		 System.out.println("Welcome to Food Shop");
		 }
		 FoodItem(double price, String name)
         {
		 Price=price;
		 Name=name;
		 }
       void setPrice(double price)
           {this.Price=price;}
       void setName(String name)
 {this.Name=name;}
double getPrice()
 {return Price;}
 String getName()
 {return Name;}
 void showDetails()
{System.out.println("Price is : "+Price);

System.out.println("Name is : "+Name);
}


}

class Pizza extends FoodItem
{
	 
 String Size;

 Pizza(){
 System.out.println("It is a default constructor");
 }
 Pizza(String size,String name,double price){
 Size=size;
 Name=name;
 Price=price;
 }
 
 void setSize(String size)
{this.Size = size;}
String getSize()
{return Size;}

void showDetails()
{
	super.showDetails();
System.out.println("Size is : "+Size);
}
 
 } 
 class Burger extends FoodItem 
{
	 
 int NumberOfPatties;

 Burger(){
 
 }
 Burger(String name,double price,int numberOfPatties )
{
Name=name;
Price=price;
 NumberOfPatties= numberOfPatties;
}
void setNumberOfPatties(int numberOfPatties)
{this.NumberOfPatties=numberOfPatties;}
int getNumberOfPatties()
{return NumberOfPatties;}

void showDetails()
{super.showDetails();

System.out.println("Number of patties is : "+NumberOfPatties);



}
}            

class Start
{public static void main(String[] arg)
{Burger br1 = new Burger("Burger",678,3);


Burger br2 = new Burger("Spicy Burger",123,5);


 //br1.setPrice(550);
  //br1.setName("Burger");
 //br1.Burger("Fahamin");
  //br1.setNumberOfPatties(2);
  br1.showDetails();
  
 //Burger br2 = new Burger();
 //br2.setPrice(500);
 // br2.setName("Burger");
  //br2.Burger("Arpa");
  //br2.setNumberOfPatties(3);
   br2.showDetails();

Pizza p = new Pizza("Ten","Pizza",670);
Pizza p2 = new Pizza("Eleven","Pizza",560);


//p.setPrice(750);
//p.setName("Pizza");
//p.Pizza("Hira");
//p.setSize("Ten");
 p.showDetails();

//Pizza p2 = new Pizza();
//p2.setPrice(750);
//p2.setName("Pizza");
//p2.Pizza("Rowoon");
//p2.setSize("Ten");
 p2.showDetails();

//System.out.println(p.getName()+" price is "+p.getPrice()+" taka & size is- "+p.getSize());  
}
}