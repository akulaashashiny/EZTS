package basic;
import java.util.*;
public class first {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double basicSalary,da,ta,grossSalary;
		System.out.print("Enter Basic Salary:");
		basicSalary=sc.nextDouble();
		if(basicSalary>=10000) {
			da=basicSalary*0.4;
			ta=basicSalary*0.3;
		}else {
			da=basicSalary*0.3;
			ta=basicSalary*0.2;
		}
		grossSalary=basicSalary+da+ta;
		System.out.println("Gross Salary:"+grossSalary);
	}

}
