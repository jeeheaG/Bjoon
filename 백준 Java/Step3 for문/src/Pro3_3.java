import java.util.Scanner;

public class Pro3_3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i=0; i<n+1; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}
}
