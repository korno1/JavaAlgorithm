package Silver5;
import java.util.Scanner;
import java.util.Vector;

public class stick1094 {

	static int checkSum(Vector<Integer> v, int n) { 
		int sum = 0;
		
		if(n!=64) {
		int k = v.get(v.size()-1);
			v.remove(v.size()-1);
			v.addElement(k/2);
			v.addElement(k/2);
		}
		
		else {
			System.out.println(1);
			return 1;
		}
		
		for(int i=0; i<v.size()-1; i++) {
			sum += v.get(i);
		}
		
		if(sum > n) {
			v.remove(v.size()-1);
			return 2;
		}
		
		else if(sum==n) {
			System.out.println(v.size()-1);
			return 1;
		}
		
		else return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		int n = sc.nextInt();
		
		v.addElement(64);
		
		while(true) {
			int check = checkSum(v, n);
			if(check == 1) {
				break;
			}
		}
		
	}

}
