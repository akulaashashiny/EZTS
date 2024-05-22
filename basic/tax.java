package basic;
import java.util.Scanner;
public class tax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double tx,age;
		System.out.print("Enter tax:");
		tx=sc.nextDouble();
		System.out.println("Enter age:");
		age=sc.nextDouble();
		if(tx<=60){
			if(tx<=250000)System.out.println("No tax");
			else if(tx>=250001&&tx<=500000)System.out.println(tx*0.05);
			else if(tx>=500001&&tx<=1000000)System.out.println(tx*0.1);
			else if(tx>=1000001&&tx<=3000000)System.out.println(tx*0.2);
	        else System.out.println(tx*0.3);
	        }
	    else{
	    	if(tx<=300000)System.out.println("No tax");
	    	else if(tx>=300001&&tx<=500000)System.out.println(tx*0.05);
	    	else if(tx>=500001&&tx<=2000000)System.out.println(tx*0.1);
	        else System.out.println(tx*0.2);
	        }
		}
}
