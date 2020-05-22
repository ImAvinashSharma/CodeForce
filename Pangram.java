package day3;
import java.util.Scanner;
public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next().toLowerCase();
		if(n>=26) {
		boolean[] alphaList = new boolean[26]; 
	      int index = 0;
	      int flag = 1;
	      for (int i = 0; i < n; i++) {
	         if ( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
	            index = str.charAt(i) - 'a'; 
	         }
	         alphaList[index] = true; 
	      }
	      for (int i = 0; i <= 25; i++) {
	         if (alphaList[i] == false)
	            flag = 0;
		}
	      if(flag==1) 
	    	  System.out.println("YES");
	      
	      else
	    	  System.out.println("NO");
		}
		else
			System.out.println("NO");
		sc.close();
	}

}
