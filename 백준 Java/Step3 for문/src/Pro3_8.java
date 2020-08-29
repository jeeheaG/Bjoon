import java.io.*;

public class Pro3_8 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		String num1[] = new String[T];
		String num2[] = new String[T];
		String ans[] = new String[T];
		
		for (int i=0; i<T; i++) {
			String nums[] = br.readLine().split(" ");
			num1[i] = nums[0];
			num2[i] = nums[1];
			ans[i] = Integer.toString(Integer.parseInt(num1[i])+Integer.parseInt(num2[i]));
		}
		br.close();
		for (int i=0; i<T; i++) {
			String n = Integer.toString(i+1);
			bw.write("Case #"+n+": "+num1[i]+" + "+num2[i]+" = "+ans[i]);
			bw.newLine();
		}
		bw.flush(); bw.close();
	}

}
