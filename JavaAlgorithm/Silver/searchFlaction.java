package Silver5;
import java.util.Scanner;

public class searchFlaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = 0;
		int cnt = 1;
		int a, b;
		while(true) {
			sum += cnt;
			if(sum>=x) break;
			cnt++;
		}
		
		cnt++;

		if(cnt%2==0) {
			a = 1;
			b = cnt-1;
			
			while(true) {
				if(sum == x) {
					break;
				}
				else {
					sum--;
					a++;
					b--;
				}
			}
		}
		
		else {
			a = cnt-1;
			b = 1;
			while(true) {
				if(sum==x) break;
				else {
					sum--;
					a--;
					b++;
				}
			}
		}
		
		System.out.println(a + "/" + b);
	}

}
