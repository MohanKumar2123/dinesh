import java.util.*;
public class special
{ public static void main(String[] args)
    {
        int large=0; 
        int num;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
          num=in.nextInt();
          if(num>large)
          {
           large=num;
          }}
          System.out.println("the largest is:"+large);
        }
}
