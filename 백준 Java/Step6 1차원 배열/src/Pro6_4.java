import java.io.*;
import java.util.ArrayList;

public class Pro6_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> remlist = new ArrayList();
		for(int i=0; i<10; i++) {
			boolean here = false;
			int rem = Integer.parseInt(br.readLine())%42;
			for(int j=0; j<remlist.size(); j++) {
				if(rem==remlist.get(j)) {
					here = true;
					break;
				}
			}
			if(here == false) {
				remlist.add(rem);
			}
		}
		System.out.println(remlist.size());
		
	}

}
