public class Student{

  int id;
  String name;
  double cgpa;
   void setID(int id)
   {
   
   this.id=id;
   }
   void setName(String name)
   {
   
   this.name=name;
   }
   void setCgpa(double cgpa)
   {
   
   this.cgpa=cgpa;
   }
   
   
   int getID()
   {
   return id;
   }
   double getCgpa()
   {
   return cgpa;
   }
   String  getName()
   {
   return name;
   }
   
   
   public static void main(String [] args){
   
   Student s1 = new Student();
    Student s2 = new Student();
	 Student s3 = new Student();
	 
   s1.setID(10);
   s1.setName("Mahadi");
   s1.setCgpa(3.92);
   
    s2.setID(11);
   s2.setName("Mohaimenul");
   s2.setCgpa(3.90);
  
  
   s3.setID(13);
   s3.setName("Badsha");
   s3.setCgpa(3.95);
  
  
   System.out.println("Student Id is: "+s1.getID());
    System.out.println("Student Name is: "+s1.getName());
	 System.out.println("Student Cgpa is: "+s1.getCgpa());
	 
	 
	 System.out.println("Student Id is: "+s2.getID());
    System.out.println("Student Name is: "+s2.getName());
	 System.out.println("Student Cgpa is: "+s2.getCgpa());
	 
	 
	 System.out.println("Student Id is: "+s3.getID());
    System.out.println("Student Name is: "+s3.getName());
	 System.out.println("Student Cgpa is: "+s3.getCgpa());
   
   
   }
}