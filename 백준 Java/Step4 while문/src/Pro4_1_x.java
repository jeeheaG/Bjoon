//�� Ǯ�̷δ� ��Ǯ��...ArrayList�Ⱦ��� BufferedWriter�� �ȽἭ �׶��׶� ��� ����ϴ� Ǯ�̷� �ٲ㼭 Ǯ���� ��.
//���� ã���� ����..if�� ���Ǿȿ� ���ڿ��迭���� ���ϰ� ���� �� �������� ��������� �ٲ㼭 �����ϱ� ��. ��??
import java.io.*;
import java.util.ArrayList;

public class Pro4_1_x {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> sum = new ArrayList<Integer>();
		while(true) {
			String a[]= br.readLine().split(" ");
			
			if (a[0]!="1" & a[1]!="2"){//&? &&? //!���ڿ� �迭���� ����!//
				System.out.println(a[0]+a[1]);
				int s = Integer.parseInt(a[0])+Integer.parseInt(a[1]);
				sum.add(s);
				
				for (int i=0; i<sum.size(); i++) {
				System.out.println(sum.get(i));
				}
			}else if(a[0]=="1" & a[1]=="2"){//!���ڿ� �迭���� ����!//
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
