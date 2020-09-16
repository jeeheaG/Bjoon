import java.io.*;

public class Pro6_7 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcase = Integer.parseInt(br.readLine());
		for(int j=0; j<tcase; j++) {
			String[] s = br.readLine().split(" ");
			int[] score = new int[Integer.parseInt(s[0])+1];
			for(int i=0; i<Integer.parseInt(s[0])+1; i++) {
				score[i] = Integer.parseInt(s[i]);
			}//받은거 숫자배열로
			double total = 0;
			for(int i=1; i<score[0]+1; i++) {
				total += score[i];
			}
			double mean = total/score[0];
			double over = 0;
			for(int i=1; i<score[0]+1; i++) {
				if(score[i]>mean) {
					over+=1;
				}
			}
			System.out.println(String.format("%.3f",over/score[0]*100)+"%");
		}
	}

}
