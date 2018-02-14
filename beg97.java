import java.util.*;
public class MyClass
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int no=in.nextInt(),revno=0;
        while(no>0)
        {
          revno=revno*10+no%10;
          no=no/10;
        }
        System.out.println(+revno);
    }
}
