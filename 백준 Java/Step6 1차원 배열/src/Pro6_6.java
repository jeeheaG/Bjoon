import java.io.*;

public class Pro6_6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for(int j=0; j<testCase; j++) {
			String[] score = br.readLine().split("");
			int combo = 0;
			int total = 0;
			for(int i=0; i<score.length; i++) {
				if(score[i].equals("O")) { //문자열 비교 시 ==말고 equals()써야함!!
					combo += 1;
					total += combo;
				}
				else if(score[i].equals("X")) {
					combo = 0;
				}	
			}
			System.out.println(total);
		}
		br.close();
	}

}
