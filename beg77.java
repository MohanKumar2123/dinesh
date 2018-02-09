import java.util.*;
public class number
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int no=in.nextInt();
        for(int i=1;i<=no;i++)
        {
            if(no%i==0)
            {
                System.out.println(+i);
            }
        }
    }
}
