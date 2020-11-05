import java.io.*;
public class Pro7_5_no1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String alphabet[] = {"a","A","b","B","c","C","d","D","e","E","f","F","g","G","h","H","i","I","j","J","k","K","l","L","m","M","n","N","o","O","p","P","q","Q","r","R","s","S","t","T","u","U","v","V","w","W","x","X","y","Y","z","Z"};
		int count[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<26; j++) {
				if(s.charAt(i)==alphabet[2*j].charAt(0) | s.charAt(i)==alphabet[2*j+1].charAt(0)) {
					count[j] += 1;
				}
			}
		}
		//count최댓값 찾기
		int maxi = 0;
		int max = count[0];
		for(int i=0; i<26; i++) {
			if (count[i]>max) {
				max = count[i];
				maxi = i;
			}
		}
		//최댓값 중복 검사
		boolean only = true;
		for(int i=0; i<26; i++) {
			if (max == count[i] && maxi != i) {
				only = false;
			}
		}
		//결과 출력
		if(only) {
			System.out.println(alphabet[2*maxi+1]);
		}
		else if(!only) {
			System.out.println("?");
			
		}
		
	}

}
