package myproject;
import java.util.Scanner;

class temp_file
{
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		char button;
		int a;
		int b;
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		System.out.println("Enter operation number");
		button=sc.next().charAt(0);
    
    switch(button) {
		case '+':System.out.println(a+b);
				break;
		case '-':System.out.println(a-b);
				break;
		case '*':System.out.println(a*b);
				break;
		case '/':System.out.println(a/b);
				break;
		case '%':System.out.println(a%b);
				break;
		default:System.out.println("operater not match");
		}
		
	}

}
