package day4;
import java.util.Scanner;
public class Repetitions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch[] = str.toCharArray();
		int a=1,c=1,g=1,t=1;
		for(int i =0;i<str.length();i++) {
			try {
				if(ch[i]==ch[i+1]) {
					if(ch[i]=='A')
						a++;
					else if(ch[i]=='C')
						c++;
					else if(ch[i]=='G')
						g++;
					else if(ch[i]=='T')
						t++;
			}
			}
			catch(Exception e) {
				break;
			}
		}
		System.out.print(Math.max(Math.max(a,c),Math.max(g,t)));
		sc.close();
	}
}
