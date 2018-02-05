import java.util.*;
public class sum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int no=in.nextInt(),p,sum=0;
        while(no>0)
        {
            p=no%10;
            sum=sum+p;
            no=no/10;
        }
        System.out.println(+sum);
    }
}
