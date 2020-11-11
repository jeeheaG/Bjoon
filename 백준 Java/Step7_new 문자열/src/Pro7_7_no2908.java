import java.io.*;
public class Pro7_7_no2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int[] num = new int[2];
		for(int j=0; j<2; j++) {
			//System.out.println('¹øÂ° ¼ö');
			for(int i=0; i<s[j].length(); i++) {
				num[j] += (s[j].charAt(i)-'0')*Math.pow(10, i);
				System.out.println(num[j]);
			}
		}
		

		

	}

}
