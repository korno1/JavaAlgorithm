package Silver5;
import java.util.Arrays;
import java.util.Scanner;

public class sortInside1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		char[] stoc = s.toCharArray();
		Arrays.sort(stoc);
		s = new StringBuilder(new String(stoc)).reverse().toString();
		
		System.out.println(s);
	}

}
