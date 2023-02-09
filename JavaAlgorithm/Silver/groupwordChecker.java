package Silver5;
import java.util.Scanner;

public class groupwordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		
		for(int i=0; i<n; i++) {
			boolean check = true;
			int arr[] = new int[26];
			String s = sc.next();
		
			for(int j=0; j<s.length(); j++) {
				if(j != 0 && arr[s.charAt(j) - 97] != 0) {
					if(s.charAt(j-1) != s.charAt(j)) {
						check = false;
						break;
					}
				}
				arr[s.charAt(j) - 97]++;
				
			}
			
			if(check==true) {
				res++;
			}
		}
		
		System.out.println(res);
	}

}
