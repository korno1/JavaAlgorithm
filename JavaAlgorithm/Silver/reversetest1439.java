package Silver5;
import java.util.Scanner;

public class reversetest1439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int cnt = 0;
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i) != s.charAt(i-1)) cnt++;
		}
		if(cnt>1) {
			if(cnt%2==0)
				cnt/=2;
			else cnt = cnt/2+1;
		}
		System.out.println(cnt);
	}

}
