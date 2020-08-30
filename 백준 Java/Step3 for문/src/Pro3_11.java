import java.io.*;
import java.util.Arrays;

public class Pro3_11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String c[] = br.readLine().split(" ");
		int[] count = Arrays.stream(c).mapToInt(Integer::parseInt).toArray();//String배열을 int배열로!!
		
		String n[] = br.readLine().split(" ");
		int[] nums = Arrays.stream(n).mapToInt(Integer::parseInt).toArray();//String배열을 int배열로!!
		String a = "";
		for (int i=0; i<count[0]; i++) {
			if (nums[i]<count[1]) {
				a=a+n[i]+" ";
			}
		}
		bw.write(a);
		br.close(); bw.flush(); bw.close();
	}

}
