class Book
{   double Price ;
	int publicationYear;
    String autherName;
	String bookTitle;
	
	
	
	Book(){
	System.out.println("A constructor has created");
	
	}


	
	
	void setautherName(String name)
   {
   
   this.autherName=name;
   }
   
   void setbookTitle(String title)
   {
   
   this.bookTitle=title;
   }
   
   
   
   void setpublicationYear(int year)
   {
   
   this.publicationYear=year;
   }
   
   void setPrice(double price)
   {
   this.Price=price;
   
   }
   
   double getPrice()
   {
   return Price;
   }
   String getbookTitle()
   {
   return bookTitle;
   }
   
   
   String getautherName()
   {
   return autherName;
   }
   
  
   
   int getpublicationYear()
   {
   return publicationYear;
   }
	
	void showdetails()
	{
		System.out.println("The Book's Name is "+getbookTitle());
		System.out.println("Writer is "+getautherName());
		System.out.println("The Price is "+getPrice());
		System.out.println("The Year is "+getpublicationYear());

	}
}

class Start{
	public static void main(String[] arg)
	{
		Book b1 = new Book();
		
		b1.setPrice(500);
		b1.setpublicationYear(2020);
		b1.setbookTitle("Jhon & Khan");
		b1.setautherName("Mahdi");
		b1.showdetails();
		
	}
}