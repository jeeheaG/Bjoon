import java.io.*;

public class Pro3_7 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		String nums[] = new String[2];
		String ans[] = new String[T];
		
		for (int i=0; i<T; i++) {
			nums = br.readLine().split(" ");
			ans[i] = Integer.toString(Integer.parseInt(nums[0])+Integer.parseInt(nums[1]));
		}
		br.close();
		for (int i=0; i<T; i++) {
			String n = Integer.toString(i+1);
			bw.write("Case #"+n+": "+ans[i]);
			bw.newLine();
		}
		bw.flush(); bw.close();
	}

}
