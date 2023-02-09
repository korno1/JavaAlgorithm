package Silver5;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class rearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int a[] = new int[n];
		Integer b[] = new Integer[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			sum += (a[i] * b[i]);
		}
		
		System.out.println(sum);
	}

}
