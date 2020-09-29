import java.util.Scanner;
public class Pro7_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//byte bt = sc.nextByte();
		//char in = sc.next().charAt(0);
		//이렇게는 다 안됨. 입력받을 때 String이 아니라 문자 한개인 char로 받아서 자료형을 byte로 바꾸어 주어야 함.
		byte bt = (byte) sc.next().charAt(0); 
		System.out.println(bt);

	}

}
