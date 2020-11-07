import java.io.*;
public class Pro7_6_no1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int count = s.length;
		for (int i=0; i<count; i++) {//띄어쓰기가 중간에 여러개 연속으로 있을수도 있으므로 trim()으로는 모두 제거할 수 없음. count를 따로 해서 공백인 문자열을 확인해 빼주어야 함.
			if(s[i]=="") {
				count-=1;
			}
		}
		
		System.out.println(count);
//		for(int i=0; i<s.length; i++) {
//			System.out.println(s[i]);
//		}
	}

}
