import java.util.Scanner;
public class Cal {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Enter Your Choice");
		System.out.println("Press 1 for Add");
		System.out.println("Press 2 for Sub");
		System.out.println("Press 3 for Mul");
		System.out.println("Press 4 for Div");
		int a = sc.nextInt();
		sc.close();
		switch (a){
		case 1:
			int d=b+c;
			System.out.println("Addition of 2 numbers "+d);
			break;
		case 2:
			d=b-c;
			System.out.println("Subtraction of 2 numbers "+d);
			break;
		case 3:
			d=b*c;
			System.out.println("Multification of 2 numbers "+d);
			break;
		case 4:
			d=b/c;
			System.out.println("Divison of 2 numbers "+d);
			break;
			default :
				System.out.println(" Enter valid number ");	
			break;
		}
	}

}
