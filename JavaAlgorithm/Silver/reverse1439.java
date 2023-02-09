package Silver5;
import java.util.Scanner;

public class reverse1439 {

	static boolean checkFirst(String s) {
		boolean check = true;
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i) != s.charAt(i-1)) {
				check = false;
				break;
			}
		}
		
		if(check==true) return true;
		else return false;
	}
	
	static int ZeroToOne(String s) {
		int cnt = 0;
		boolean check = false;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '0') {
				if(check == false) {
					cnt++;
					check = true;
				}
			}
			else {
				check = false;
			}
		}
		
		return cnt;
	}
	
	static int OneToZero(String s) {
		int cnt = 0;
		boolean check = false;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '1') {
				if(check == false) {
					cnt++;
					check = true;
				}
			}
			else {
				check = false;
			}
		}
		
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(checkFirst(s)) System.out.println(0);
		else {
			int otz = OneToZero(s);
			int zto = ZeroToOne(s);
	
			
			System.out.println(otz >= zto ? zto : otz);
		}
		
	}

}
