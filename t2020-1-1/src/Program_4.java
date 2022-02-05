import java.util.Scanner;
public class Program_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[11];
		System.out.println("Enter the Element of an array :");
		
		for (int i=0; i<11; i++) {
			a[i]  = sc.nextInt();
		}
		
		for (int i=0; i<11; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
		
		
		for (int j=1; j<=9; j++) {
			int count = 0;
			for(int i=0; i<11; i++) {
				if (a[i] % j == 0)
					count++;
			}
			System.out.print(j +" : "+count+" ");
		}
		sc.close();
	}
}