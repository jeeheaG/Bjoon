import java.io.*;

public class Pro7_3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int hanNum = 0;
		int n = Integer.parseInt(br.readLine());
		for(int test=1; test<n+1; test++) {
			int big = (int)(Math.log10(test)+1); //test�� ���ڸ� ������ ����
			//System.out.println(test+"�� �ڸ�����"+big);
			int[] each = new int[big];
			for(int i=0; i<big; i++) {
				each[i] = (int)((test/Math.pow(10, big-i-1))%10);
				//System.out.println("�� �ڸ��� ���ڴ� "+(int)((test/Math.pow(10, big-i-1))%10));
			}
			boolean han = false;
			if(big == 1 || big ==2) {
				han = true;
			}
			else {
				for(int i=0; i<big-2; i++) {
					if(each[i]-each[i+1] == each[i+1]-each[i+2]) {
						han = true;
						for(int k=0; k<big; k++) {
							//System.out.println(test+"�� ��"+k+"��° �ڸ����� "+each[k]);
						}
						//System.out.println((each[i]-each[i+1])+" == "+(each[i+1]-each[i+2]));
						//System.out.println(test+"�� �� �Ѽ�true");
					}
					else {
						//System.out.println(test+"�� �� �Ѽ�false");
						break;
						
					}
				}
			}
			if(han == true) {
				hanNum += 1;
			}
		}
		System.out.println(hanNum);

	}

}
