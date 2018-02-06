import java.util.*;
public class special
{ public static void main(String[] args)
    {
        int max=0; 
        int num;
        Scanner in=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
          num=in.nextInt();
          if(num>max)
          {
           max=num;
          }}
          System.out.println("the largest  number is:"+max);
        }
}
