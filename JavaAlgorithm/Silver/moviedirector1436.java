package Silver5;
import java.util.Scanner;

public class moviedirector1436 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 666;
		int cnt = 0;
		while(true) {
			if(n==cnt) break;
			int count = 0;
			int j = i;
			
			while(j!=0) {
				if(j%10==6) {
					count++;
				}
				else {
					count = 0;
				}
				
				j/=10;
				if(count==3) break;
			}
			
			if(count==3) cnt++;
			i++;
		}
		
		System.out.println(i-1);
	}

}
