import java.io.*;

public class Pro4_3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num = n;
		int i = 0;
		while (true) {
			int m = 10*(num%10) + (num/10+num%10)%10;
			i+=1;
			num = m;
			if(m==n) {
				break;
			}
		}
		System.out.println(i);
	}
}
