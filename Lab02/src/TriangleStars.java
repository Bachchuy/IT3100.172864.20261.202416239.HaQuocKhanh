import java.util.Scanner;
public class TriangleStars {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the height of the triangle (n): ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
				for(int j=1;j<=2*i+1;j++) {
					System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
