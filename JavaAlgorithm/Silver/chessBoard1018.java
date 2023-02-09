package Silver5;
import java.util.Scanner;

public class chessBoard1018 {
	static char wb[][] = {
			{'W','B', 'W','B', 'W','B', 'W','B'},
			{'B','W', 'B','W', 'B','W', 'B','W'},
			{'W','B', 'W','B', 'W','B', 'W','B'},
			{'B','W', 'B','W', 'B','W', 'B','W'},
			{'W','B', 'W','B', 'W','B', 'W','B'},
			{'B','W', 'B','W', 'B','W', 'B','W'},
			{'W','B', 'W','B', 'W','B', 'W','B'},
			{'B','W', 'B','W', 'B','W', 'B','W'}
	};
	
	static char bw[][] = {
			{'B','W', 'B','W', 'B','W', 'B','W'},
			{'W','B', 'W','B', 'W','B', 'W','B'},
			{'B','W', 'B','W', 'B','W', 'B','W'},
			{'W','B', 'W','B', 'W','B', 'W','B'},
			{'B','W', 'B','W', 'B','W', 'B','W'},
			{'W','B', 'W','B', 'W','B', 'W','B'},
			{'B','W', 'B','W', 'B','W', 'B','W'},
			{'W','B', 'W','B', 'W','B', 'W','B'}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 10000;
		char board[][] = new char[n][m];
		
		for(int i=0; i<n; i++) {
			String s = sc.next();
			for(int j=0; j<m; j++) {
				board[i][j] = s.charAt(j);
			}
		}
		
		for(int i=0; i<n-7; i++) {
			for(int j=0; j<m-7; j++) {
				int count = 0;
				for(int k=0; k<8; k++) {
					for(int p=0; p<8; p++) {
						if(wb[k][p] != board[k+i][j+p]) count++;
					}
				}
				if(sum > count) sum = count;
				count = 0;
				for(int k=0; k<8; k++) {
					for(int p=0; p<8; p++) {
						if(bw[k][p] != board[k+i][j+p]) count++;
					}
				}
				
				if(sum > count) sum = count;
			}
		}
		
		System.out.println(sum);
		
	}

}
