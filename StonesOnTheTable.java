package avinashCode;
import java.util.Scanner;
public class StonesOnTheTable {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		String str = sc.next();
		char ch[] = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			try {
			if(ch[i]==ch[i+1]) 
				count++;
		}
			catch(Exception e) {
				break;
			}
		}
 		System.out.println(count);
		sc.close();
	}

}
