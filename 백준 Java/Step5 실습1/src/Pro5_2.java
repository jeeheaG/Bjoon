import java.io.*;

public class Pro5_2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] burger = new int[3];
		int[] drink = new int[2];

		for (int i=0; i<3; i++) {
			burger[i] = Integer.parseInt(br.readLine());
		}
		for (int i=0; i<2; i++) {
			drink[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		int b=burger[0]; int d=drink[0];		
		for (int i=0; i<burger.length; i++) {
			if(b>burger[i]) {
				b = burger[i];
			}
		}	
		for (int i=0; i<drink.length; i++) {
			if(d>drink[i]) {
				d = drink[i];
			}
		}
		System.out.println(b+d-50);
		
		
	}
}
