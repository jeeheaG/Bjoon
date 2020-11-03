import java.io.*;
public class Pro7_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int k=0; k<t; k++) {
			String[] cases = br.readLine().split(" ");
			int r = Integer.parseInt(cases[0]);
			String s = cases[1];
			String p = new String();
		
			for(int j=0; j<s.length(); j++) {
				for(int i=0; i<r; i++) {
					p += s.charAt(j);
				}
			}
			System.out.println(p);
		}
	}
}
