
import java.util.Scanner;

public class Calculator {
    Calculator(){
        System.out.println("Welcome to calculator");
    }
     void addition(double v1, double v2){
        double cal = v1+v2;
        System.out.println("The sum : "+ v1 + "+" + v2 + "= " + cal);
    }
    void substraction(double v1, double v2){
        double cal = v1-v2;
        System.out.println("The subtraction : "+ v1 + "-" + v2 + "= " + cal);
    }
    void multiplication(double v1, double v2){
        double cal = v1*v2;
        System.out.println("The multiplication:  "+ v1 + "*" + v2 + "= " + cal);
    }
    void division(double v1, double v2){
        double cal = v1/v2;
        System.out.println("The division of:  "+ v1 + "/" + v2 + "= " + cal);
    }
}
class Start{
    public static void main(String[] args) {
        int choice ;
        Calculator calc= new Calculator();
        Scanner input = new Scanner(System.in);

        System.out.print("input variable 1:");
        double v1= input.nextDouble();
        System.out.print("input variable 2:");
        double v2 = input.nextDouble();
        System.out.println();
        System.out.println(" 1 for addition");
        System.out.println(" 2 for subtraction");
        System.out.println(" 3 for multiplication");
        System.out.println(" 4 for division");
        System.out.print("Enter Choice:");
        choice = input.nextInt();
        switch (choice){
            case 1:
                calc.addition(v1,v2);
                break;
            case 2:
                calc.substraction(v1,v2);
                break;
            case 3:
                calc.multiplication(v1,v2);
                break;
            case 4:
                calc.division(v1,v2);
                break;
            default:
                System.out.println("User must input a choice!");
        }
    }
}