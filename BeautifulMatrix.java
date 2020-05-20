package avinashCode;
import java.util.Scanner;
public class BeautifulMatrix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int matrix[][] = new int[6][6];
		int i,j=0;
		for(i = 1;i<=5;i++) {
			for(j =1;j<=5;j++) {
				matrix[i][j]=sc.nextInt();
				if(matrix[i][j]==1) {
					System.out.println(Math.abs(3-i)+Math.abs(3-j));
				}
			}
		}
		sc.close();
	}

}
