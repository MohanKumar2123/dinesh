import java.util.*;
public class number
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int no=in.nextInt(),i;int a[]=new int[5];

        for(i=0;i<5;i++)
        {
            a[i]=no%10;
            no=no/10; 
        }
        for(i=4;i>=0;i--)
        {
            System.out.println(+a[i]);
        }
    }
}
