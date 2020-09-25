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
			for(int j=0; j<10000; j++) {//ã�� �����
				if(num[j] == gen) {
					num[j] = 0;
				}
			}
		}
		for(int i=0; i<10000; i++) {//���
			if(num[i] != 0) {
				br.write(Integer.toString(num[i]));
				br.newLine();
			}
		}
		br.flush();br.close();
		
//�̰͵� �۵��� �� �Ǵµ� ���ؿ��� ��Ÿ�ӿ��� ���� BufferdWriter�� �ٲ�
//		for(int i=0; i<10001; i++) {//���
//			if(num[i] != 0) {
//				System.out.println(num[i]);
//			}
//		}
		
	}
}
