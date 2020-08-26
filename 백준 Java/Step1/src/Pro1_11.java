import java.util.Scanner;

public class Pro1_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int hunb = b/100;
		int tenb = b/10 - hunb*10;
		int oneb = b - tenb*10 - hunb*100;
		System.out.println(a*oneb);
		System.out.println(a*tenb);
		System.out.println(a*hunb);
		System.out.println(a*b);
	}

}
