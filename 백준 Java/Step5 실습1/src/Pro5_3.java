import java.io.*;
import java.util.Arrays;

public class Pro5_3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] n = br.readLine().split(" ");
		br.close();
		int[] num = Arrays.stream(n).mapToInt(Integer::parseInt).toArray();
		for (int i=0; i<num.length-1; i++) {
			for(int j=0; j<num.length-1; j++) {
				if(num[j]>num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1]; num[j+1] = temp;
				}
			}
		}
		System.out.println(num[num.length/2]);
	}
}
