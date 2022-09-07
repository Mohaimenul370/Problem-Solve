import java.util.Scanner;
class Searching {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int item;
		item=sc.nextInt();
		
		int Ar[]={2,4,3,1,7,8,4};
		
		for(int i=0; i<Ar.length ; i++){
		    
		    Ar[i]=item;
		    break;
		    
		}
		System.out.println("the position is:"+Ar[i]);
	}
}