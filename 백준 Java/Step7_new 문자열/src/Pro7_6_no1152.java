import java.io.*;
public class Pro7_6_no1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int count = s.length;
		for (int i=0; i<count; i++) {//���Ⱑ �߰��� ������ �������� �������� �����Ƿ� trim()���δ� ��� ������ �� ����. count�� ���� �ؼ� ������ ���ڿ��� Ȯ���� ���־�� ��.
			if(s[i]=="") {
				count-=1;
			}
		}
		
		System.out.println(count);
//		for(int i=0; i<s.length; i++) {
//			System.out.println(s[i]);
//		}
	}

}
