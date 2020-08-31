import java.io.*;
import java.util.ArrayList;

public class Pro4_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String a[]= br.readLine().split(" ");
			int n1 = Integer.parseInt(a[0]);
			int n2 = Integer.parseInt(a[1]);
			if (n1==0 && n2==0){//여길 상수변수들 비교로 바꿔서 해결.
				break;
			}
			System.out.println(n1+n2);
		}
		br.close(); //System.out.println("End");

	}

}
