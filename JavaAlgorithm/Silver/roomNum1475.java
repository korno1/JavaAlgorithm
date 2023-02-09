package Silver5;
import java.util.Scanner;

public class roomNum1475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int n = sc.nextInt();
		int m = 0;
		int j = 0;
		while(n!=0) {
			arr[n%10]++;
			n/=10;
		}
		
		int sum = arr[6] + arr[9];
		
		arr[6] = 0; arr[9] = 0;
		
		if(sum%2==0) arr[6] = sum/2;
		else arr[6] = sum/2 + 1;
		
		for(int i=0; i<10; i++) {
			if(arr[i] > m) {
				m = arr[i];
				j = i;
			}
		}
		
		System.out.println(m);
		
	}

}