import java.io.*;

public class Pro5_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a="";
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			a="";
			for(int k=0; k<i; k++) {
				a+=" ";
			}
			for(int k=0; k<2*(n-i)-1; k++) {
				a+="*";
			}
			System.out.println(a);
		}
		for(int i=0; i<n-1; i++) {
			a="";
			for(int k=0; k<n-i-2; k++) {
				a+=" ";
			}
			for(int k=0; k<2*i+3; k++) {
				a+="*";
			}
			System.out.println(a);
		}
		
		
	}

}
