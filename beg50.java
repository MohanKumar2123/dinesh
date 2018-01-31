
import java.util.*;
 public class powertwo{
    static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
           while (n !=1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(isPowerOfTwo(a)?"Yes":"no");

    }
}
 

