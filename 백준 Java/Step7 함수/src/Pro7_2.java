import java.io.*;

public class Pro7_2 {
	public static void main(String[] args) throws IOException {
		BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] num = new int[10000];
		int gen = 0;
		for(int i=1; i<10001; i++) {
			num[i-1] = i;
		}
		for(int i=0; i<10000; i++) {
			gen = i + i%10 + i/10%10 + i/100%10 + i/1000%10 + i/10000;
			for(int j=0; j<10000; j++) {//찾아 지우기
				if(num[j] == gen) {
					num[j] = 0;
				}
			}
		}
		for(int i=0; i<10000; i++) {//출력
			if(num[i] != 0) {
				br.write(Integer.toString(num[i]));
				br.newLine();
			}
		}
		br.flush();br.close();
		
//이것도 작동은 잘 되는데 백준에서 런타임에러 나서 BufferdWriter로 바꿈
//		for(int i=0; i<10001; i++) {//출력
//			if(num[i] != 0) {
//				System.out.println(num[i]);
//			}
//		}
		
	}
}
