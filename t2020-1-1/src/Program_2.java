import java.util.Scanner;
public class Program_2 {
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number :");
		 int a = sc.nextInt();
		 sc.close();
		 for (int i=1;i<(a*2);i++) {
			 if(i%2!=0) {
				 System.out.println(i);
			 }
		 }
}
}