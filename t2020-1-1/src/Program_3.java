import java.util.Scanner;
public class Program_3 {
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number :");
		 int a = sc.nextInt();
		 sc.close();
		 if (a % 2 == 0)
			 a = a-1;
		 for (int i=1;i<(a*2);i++) {
			 if(i%2!=0) {
				 System.out.println(i);
			 }
		 }
}
}