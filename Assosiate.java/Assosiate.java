package address;

 

 

public class Address {

 

   int streetNum;

   String city;

   String state;

   String Country;

   Address(int street, String c,String st, String coun){

       this. streetNum = street;

       this.city = c;

       this.state = st;

       this.Country = coun;

   

    }

   

}

public class StudentClass {

   

    int rollNum;

    String studentName;

    //creating relationship with Address class

    Address studentAddr;

    StudentClass(int roll, String name,Address addr1){

        this.rollNum = roll;

        this.studentName = name;

        this. studentAddr = addr1;

    }

   

}

public class MyMain {

   

    public static void main(String args[]){

        Address ad = new Address(55,"Banani", "Dhaka", "Bangladesh");

        StudentClass obj = new StudentClass(123, "Steve Rogers", ad);

        System.out.println(obj.rollNum);

        System.out.println(obj.studentName);

        System.out.println(obj.studentAddr.streetNum);

        System.out.println(obj.studentAddr.city);

        System.out.println(obj.studentAddr.state);

        System.out.println(obj.studentAddr.Country);

    }

   

    

}