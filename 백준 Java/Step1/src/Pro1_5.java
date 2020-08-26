import java.util.Scanner;

public class Pro1_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//scanner객체를 만듦. System.in:생성할 개체가 '시스템이 입력받을 수 있는'스캐너 객체라는 뜻. 
		int a;
		int b;
		//이제 질문을 한 후 입력값을 받자
		///System.out.println("10이하의 정수 두개를 입력하세요."); 이건 백준 채점에선 없어야 맞았다고 나옴
		//next(),nextInt(),nextString()..공백을 기준으로 끊어서 읽어옴. 한 줄을 다 읽어오고 싶으면 nextLine()
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+b);
	}

}
