import java.io.*;

public class Pro5_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a = 0,b = 0;//각각 첫째줄, 둘째줄 별 갯수.
		String fl="", sl="";
		for(int i=1; i<n+1; i++) {
			if(i%2==1) {
				a+=1;
			}
			else {
				b+=1;
			}
		}
		for(int i=0; i<a; i++) {
			fl+="* ";
		}
		for(int i=0; i<b; i++) {
			sl+=" *";
		}
		for(int i=0; i<n; i++) {
		System.out.println(fl);
		System.out.println(sl);
		}
	}

}
