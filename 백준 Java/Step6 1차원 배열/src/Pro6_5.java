import java.io.*;
import java.util.ArrayList;

public class Pro6_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] score = br.readLine().split(" ");
		int max = Integer.parseInt(score[0]);
		ArrayList<Float> newSc = new ArrayList();
		float total=0;
		
		for(int i=1; i<n; i++) {
			if(max<Integer.parseInt(score[i])) {
				max = Integer.parseInt(score[i]);
			}
		}
		for(int i=0; i<n; i++) {
			newSc.add(Float.parseFloat(score[i])/max*100); //�ڹٴ� float(�Ҽ����ִ�����)�� ����� ��� �ʹٸ� ��������ڰ� ���� ���� ���� ���� float���·� �־�� �Ѵ�.
			total += newSc.get(i);
		}
		System.out.println(total/n);
	}

}
