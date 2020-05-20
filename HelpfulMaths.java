package avinashCode;
import java.util.Arrays;
import java.util.Scanner;
public class HelpfulMaths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int nums[] = new int[str.length()/2+1];
		int index = 0;
		for (char c : str.toCharArray()) {
			if (c != '+') {
				nums[index] = Character.getNumericValue(c);
				index++;
			}
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-1; i++) {
			System.out.print(nums[i]+"+");
		}
		System.out.print(nums[nums.length-1]);
		sc.close();
	}

}
