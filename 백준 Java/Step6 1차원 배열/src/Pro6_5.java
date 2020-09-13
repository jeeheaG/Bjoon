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
			newSc.add(Float.parseFloat(score[i])/max*100); //자바는 float(소수점있는형태)로 결과를 얻고 싶다면 산술연산자가 따로 없고 원래 수를 float형태로 넣어야 한다.
			total += newSc.get(i);
		}
		System.out.println(total/n);
	}

}
