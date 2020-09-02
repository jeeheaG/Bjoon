import java.io.*;

public class Pro5_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] score = new int[5];
		for (int i=0; i<5; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a<=40) {
				a = 40;
			}
			score[i] = a;
		}
		System.out.println((score[0]+score[1]+score[2]+score[3]+score[4])/5);
	}

}
