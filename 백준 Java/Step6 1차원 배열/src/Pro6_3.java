import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Pro6_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Integer> count = new ArrayList(Arrays.asList(0,0,0,0,0,0,0,0,0,0));
		for(int i=0; i<3; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		int sum = list.get(0)*list.get(1)*list.get(2);
		String s = Integer.toString(sum);	
		System.out.println(sum);
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<10; j++) {
				//System.out.println(s.charAt(i));
				if(s.charAt(i)==(char)(j+'0')) {//int�� char�� ����ȯ�ϸ� int�� ����״�ΰ� �ƴ϶� �ƽ�Ű�ڵ尪 ���ڿ��η� ��ȯ�Ѵ�. �ڿ� +'0'�̳� +48�� �ٿ��ָ� �ذ��.
					count.set(j, count.get(j)+1);
					
					//System.out.println(j+"���� ���ϱ�");
					break;
				}
			}
		}
		for(int i=0; i<10; i++) {
			System.out.println(count.get(i));
		}
	}

}
