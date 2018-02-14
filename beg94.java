import java.util.*;
public class MyClass
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt(),req=in.nextInt(),no;
        for(int i=1;i<=N;i++)
        {no=in.nextInt();
            if(i==req)
            {
          System.out.println(+no);

            }
        }
    }
}
