package Classes;
import java.util.Scanner;

public class fecility  //Sorry Facility but do not change the name 
{
    public String fec_name;
    public void add_feci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fec_name = input.nextLine();
    }
    public void show_feci()
    {
        System.out.println(fec_name);
    }
}