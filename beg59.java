import java.util.*;
public class special
{ public static void main(String[] args)
    {
        int large=0; 
        int num;
        Scanner in=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
          num=in.nextInt();
          if(num>large)
          {
           large=num;
          }}
          System.out.println("the largest is:"+large);
        }
}
