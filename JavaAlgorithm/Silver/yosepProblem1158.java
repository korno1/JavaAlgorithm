package Silver5;
import java.util.Scanner;
import java.util.Vector;

public class yosepProblem1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		Vector<Integer> res = new Vector<>();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int p = 0;
		
		for(int i=1; i<=n; i++) {
			v.add(i);
		}
		
		while(!v.isEmpty()) {
			p += k-1;
			/*
			if(p > v.size()-1) {
				p = 0 + (p - v.size());
			}
			*/
			
			while(p > v.size()-1) {
				p = 0 + (p - v.size());
			}
			res.add(v.remove(p));
		}
		
		System.out.print('<');
		for(int i=0; i<res.size()-1; i++) {
			System.out.print(res.get(i) + ", ");
		}
		System.out.println(res.get(res.size()-1) + ">");
		
		
	}

}
