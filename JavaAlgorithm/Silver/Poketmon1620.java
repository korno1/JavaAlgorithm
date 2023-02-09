package Silver4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Poketmon1620 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<String, String> pname = new HashMap<String, String>();
		Map<String, String> pnum = new HashMap<String, String>();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			String s = sc.next();
			pname.put(s, Integer.toString(i));
			pnum.put(Integer.toString(i), s);
		}
		
		for(int i=0; i<m; i++) {
			String s = sc.next();
			if(pname.containsKey(s))
				System.out.println(pname.get(s));
			else
				System.out.println(pnum.get(s));
		}
	}

}
