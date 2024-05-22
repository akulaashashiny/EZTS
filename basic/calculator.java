package basic;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter a value:");
		a=sc.nextInt();
		System.out.println("Enter b value:");
		b=sc.nextInt();
		System.out.print("select an operation:");
		char op=sc.next().charAt(0);
		switch(op){
		case '+':System.out.println(a+b);break;
		case '-':System.out.println(a-b);break;
        case '*':System.out.println(a*b);break;
        case '/':System.out.println(a/b);break;
        case '%':System.out.println(a%b);break;
        default:System.out.println("wrong option");break;
        }
	}

}
