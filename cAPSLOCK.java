package day2;
import java.util.Scanner;
public class cAPSLOCK {

	public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        String x = ip.next();
        StringBuilder buf = new StringBuilder(x);
        if(x.equals(buf.toString().toUpperCase()))
            System.out.println(buf.toString().toLowerCase());
        else if(buf.substring(0,1).equals(buf.substring(0,1).toLowerCase()))
        {
            if(buf.substring(1).equals(buf.substring(1).toUpperCase()))
                System.out.println(buf.substring(0, 1).toUpperCase()+buf.substring(1).toLowerCase());
            else
                System.out.println(x);
        }
        else
            System.out.println(x);
        ip.close();
    }

}
