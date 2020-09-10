import java.io.*;

public class Pro6_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] n = new int[9];
		for(int i=0; i<9; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		int max = n[0];
		int maxindex = 0;
		for(int i=1; i<9; i++) {
			if(max<n[i]) {
				max=n[i];
				maxindex = i;
			}
		}
		System.out.println(max);
		System.out.println(maxindex+1);
	}

}
