import java.util.*;
public class sum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int no=in.nextInt();
        while(no>0)
        {
            if(no%2==0)
            {
                        System.out.println(+no);
break;
            }
            no--;
        }
    }
}
