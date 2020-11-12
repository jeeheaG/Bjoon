//반복문 돌려서 더 짧게 못하나?
import java.io.*;
public class Pro7_7_no5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int t = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='A' || s.charAt(i)=='B' || s.charAt(i)=='C') {
				 t += 3;
				 continue;
			}
			else if(s.charAt(i)=='D' || s.charAt(i)=='E' || s.charAt(i)=='F') {
				 t += 4;
				 continue;
			}
			else if(s.charAt(i)=='G' || s.charAt(i)=='H' || s.charAt(i)=='I') {
				 t += 5;
				 continue;
			}
			else if(s.charAt(i)=='J' || s.charAt(i)=='K' || s.charAt(i)=='L') {
				 t += 6;
				 continue;
			}
			else if(s.charAt(i)=='M' || s.charAt(i)=='N' || s.charAt(i)=='O') {
				 t += 7;
				 continue;
			}
			else if(s.charAt(i)=='P' || s.charAt(i)=='Q' || s.charAt(i)=='R' || s.charAt(i)=='S') {
				 t += 8;
				 continue;
			}
			else if(s.charAt(i)=='T' || s.charAt(i)=='U' || s.charAt(i)=='V') {
				 t += 9;
				 continue;
			}
			else if(s.charAt(i)=='W' || s.charAt(i)=='X' || s.charAt(i)=='Y' || s.charAt(i)=='Z') {
				 t += 10;
				 continue;
			}
		}
		System.out.println(t);

	}

}
