import java.io.*;

public class Pro5_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String a = "" ;
		for(int i=0; i<n; i++) {
			a += "*";
			System.out.println(a);
		}
		for(int i=0; i<n-1; i++) {
			String acut = a.substring(0,n-1-i);
			System.out.println(acut);
		}
	}

}
