package day4;
public class Prime {
    public static void main(String[] args) {
        int low = 2, high = 10000000,k=0;
        while (low <= high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }
            
            if (!flag && low != 0 && low != 1) {
            	k++;
            	if(k==10001) {
            		System.out.println(k+"="+low);
            		break;
            	}
            }
            ++low;
        }
    }
}


