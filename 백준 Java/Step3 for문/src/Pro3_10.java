import java.io.*;

public class Pro3_10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for (int i=1; i<n+1; i++) {
			String a = "";
			for (int j=0; j<n-i; j++) {
				a=a+" ";
			}
			for (int k=0; k<i; k++) {
				a=a+"*";
			}
			bw.write(a); bw.newLine();
		}
		br.close(); bw.flush(); bw.close();
	}

}
