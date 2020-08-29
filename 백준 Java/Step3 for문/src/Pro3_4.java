import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Pro3_4 {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		int num1[] = new int[t];//더할 두개의 숫자를 따로 저장할겨
		int num2[] = new int[t];
		String SUM[] = new String[t];
			
		for (int i=0; i<t; i++) {
			String nums = br.readLine(); //한줄단위로 입력받음
			StringTokenizer tok = new StringTokenizer(nums, " ");
			num1[i] = Integer.parseInt(tok.nextToken());
			num2[i] = Integer.parseInt(tok.nextToken());
			SUM[i] = Integer.toString(num1[i]+num2[i]);
			
			bw.write(SUM[i]); bw.newLine();
		}
		br.close(); bw.flush(); bw.close();
	}
}
