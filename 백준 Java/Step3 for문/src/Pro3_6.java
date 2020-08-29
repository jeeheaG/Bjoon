import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Pro3_6 {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String nums[] = new String[n];
		for (int i=0; i<n; i++) {
			nums[i] = Integer.toString(n-i);	
			bw.write(nums[i]); bw.newLine();
		}
		br.close(); bw.flush(); bw.close();
	}
}
