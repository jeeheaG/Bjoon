import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro3_4 {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine(); //한줄단위로 입력받음
		StringTokenizer tok = new StringTokenizer(a, " ");
		int num[] = Integer.parseInt(tok.nextToken());
		for (int i=1; i<10; i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		} 
	}
}
