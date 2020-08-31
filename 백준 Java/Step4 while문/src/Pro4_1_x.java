//이 풀이로는 안풀려...ArrayList안쓰고 BufferedWriter도 안써서 그때그때 결과 출력하는 풀이로 바꿔서 풀어보기로 함.
//문제 찾은거 같음..if문 조건안에 문자열배열값을 비교하게 넣은 게 문제였음 상수변수로 바꿔서 넣으니까 됨. 왜??
import java.io.*;
import java.util.ArrayList;

public class Pro4_1_x {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> sum = new ArrayList<Integer>();
		while(true) {
			String a[]= br.readLine().split(" ");
			
			if (a[0]!="1" & a[1]!="2"){//&? &&? //!문자열 배열값이 문제!//
				System.out.println(a[0]+a[1]);
				int s = Integer.parseInt(a[0])+Integer.parseInt(a[1]);
				sum.add(s);
				
				for (int i=0; i<sum.size(); i++) {
				System.out.println(sum.get(i));
				}
			}else if(a[0]=="1" & a[1]=="2"){//!문자열 배열값이 문제!//
				break;
			}	
		}
		br.close();
		System.out.println(sum.get(0));
//		for (int i=0; i<sum.size(); i++) {
//			bw.write(Integer.toString(sum.get(i))); bw.newLine();
//		}
//		bw.flush(); bw.close();

	}

}
