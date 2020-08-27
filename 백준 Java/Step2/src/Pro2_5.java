import java.util.Scanner;

public class Pro2_5 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if (m>=45) {
			m=m-45;
		}
		else if (m<45) {
			m=m+15;
			if (h==0) {
				h=23;
			}
			else {
				h=h-1;
			}
		}
		else {
			System.out.println("error");
		}
		System.out.println(h+" "+m);
	}
}
