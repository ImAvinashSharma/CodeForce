
import java.util.Scanner;
public class Tram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b,c=0,m=0;
	
	    while (n>0)
	    {
	        a = sc.nextInt();
	        b = sc.nextInt();
	        c -= a;
	        c += b;
	        if (c > m)
	        {
	            m = c;
	        }
	        n--;
	    }
		System.out.println(m);
		sc.close();
	}

}
