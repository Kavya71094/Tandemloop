import java.util.*;
public class Program_1 {
	public static void main(String args[]) {
		double a,b,c;
		String type;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value :");
		a = sc.nextDouble();
		System.out.println("Enter b value :");
		b =sc.nextDouble();
		System.out.println("Enter the type of the operation (+ - * /)");
		type = sc.next();
		sc.close();
		switch(type) {
		case "+":
			c = a+b;
			System.out.println("Addition :"+c);
			break;
		case "-":
			c = a-b;
			System.out.println("Subtraction :"+c);
			break;
		case "*":
			c = a*b;
			System.out.println("Multiplication :"+c);
			break;
		case "/":
			c = a/b;
			System.out.println("Division :"+c);
			break;
		}
}
}
