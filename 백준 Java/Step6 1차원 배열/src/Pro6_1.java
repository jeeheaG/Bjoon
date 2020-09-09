import java.io.*;

public class Pro6_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] num = br.readLine().split(" ");
		int min = Integer.parseInt(num[0]);
		int max = Integer.parseInt(num[0]);
		for (int i=0; i<n; i++) {
			if (min>Integer.parseInt(num[i])) {
				min = Integer.parseInt(num[i]);
			}
			if (max<Integer.parseInt(num[i])) {
				max = Integer.parseInt(num[i]);
			}
		}
		System.out.println(Integer.toString(min)+" "+Integer.toString(max));
	}
}


