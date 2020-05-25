package day6;
import java.util.Scanner;
public class BrainsPhotos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m=sc.nextInt();
		int c=0,m0=0,w=0,y=0,g=0,b=0;
		for(int i =0;i<n*m;i++) {
			char ch = sc.next().charAt(0);
			if(ch=='C')
				c++;
			else if(ch=='Y')
				y++;
			else if(ch=='M')
				m0++;
			else if(ch=='W')
				w++;
			else if(ch=='G')
				g++;
			else if(ch=='B')
				b++;
		}
		if(c>0||m0>0||y>0)
			System.out.println("#Color");
		else if(w>0||b>0||g>0)
			System.out.println((c+y+m0)>(w+g+b)?"#Color":"#Black&White");
		sc.close();
	}

}
