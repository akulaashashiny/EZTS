package basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,fact=1;
		System.out.print("Enter a value:");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.print("Factorial of "+num+"="+fact);
	}

}
