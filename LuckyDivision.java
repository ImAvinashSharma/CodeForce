import java.util.Scanner;
public class LuckyDivision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean f = false;
		int arr[] = {4,7,47,74,44,444,447,474,477,777,774,744};
		for(int i = 0;i<12;i++) {
			if(num%arr[i]==0) {
				f = true;
			}
		}
		if(f)
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}
}
