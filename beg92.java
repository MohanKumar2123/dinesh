import java.util.*;
public class MyClass
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt(),no,sum=0;
        for(int i=1;i<=N;i++)
        {
            no=in.nextInt();
            sum=sum+no;
        }
        System.out.println(+sum);
    }
}
