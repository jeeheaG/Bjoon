//예외처리!!
import java.io.*;

public class Pro4_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			try {
				String a[] = br.readLine().split(" ");
				int s = Integer.parseInt(a[0])+Integer.parseInt(a[1]);
				System.out.println(s);
			}catch(Exception e) {
				break;
			}	
		}
		br.close();
	}

}
