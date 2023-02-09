package Silver5;
import java.util.Scanner;

public class hanNum1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		
		if(n<100) cnt = n;
		
		else {
			cnt = 99;
			if(n==1000) n--;
			for(int i=100; i<=n; i++) {
				int k = i;
				int num[] = new int[3];
				int j = 2;
				while(k!=0) {
					num[j] = k%10;
					k/=10;
					j--;
				}
				
				if((num[0]-num[1]) == (num[1]-num[2])) cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
