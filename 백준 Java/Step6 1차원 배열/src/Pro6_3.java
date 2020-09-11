import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Pro6_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Integer> count = new ArrayList(Arrays.asList(0,0,0,0,0,0,0,0,0,0));
		for(int i=0; i<3; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		int sum = list.get(0)*list.get(1)*list.get(2);
		String s = Integer.toString(sum);	
		System.out.println(sum);
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<10; j++) {
				//System.out.println(s.charAt(i));
				if(s.charAt(i)==(char)(j+'0')) {//int를 char로 형변환하면 int값 생긴그대로가 아니라 아스키코드값 문자열로로 반환한다. 뒤에 +'0'이나 +48을 붙여주면 해결됨.
					count.set(j, count.get(j)+1);
					
					//System.out.println(j+"개수 더하기");
					break;
				}
			}
		}
		for(int i=0; i<10; i++) {
			System.out.println(count.get(i));
		}
	}

}
