import java.io.*;

public class Pro3_9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String a = "";
		for (int i=0; i<n; i++) {
			a=a+"*";
			bw.write(a); bw.newLine();
		}
		br.close(); bw.flush(); bw.close();
	}

}
