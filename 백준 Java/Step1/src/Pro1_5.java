import java.util.Scanner;

public class Pro1_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//scanner��ü�� ����. System.in:������ ��ü�� '�ý����� �Է¹��� �� �ִ�'��ĳ�� ��ü��� ��. 
		int a;
		int b;
		//���� ������ �� �� �Է°��� ����
		///System.out.println("10������ ���� �ΰ��� �Է��ϼ���."); �̰� ���� ä������ ����� �¾Ҵٰ� ����
		//next(),nextInt(),nextString()..������ �������� ��� �о��. �� ���� �� �о���� ������ nextLine()
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+b);
	}

}
