import java.util.*;
public class special
{ public static void main(String[] args)
    {
        int sum=0; int n;
        int num=1;
        Scanner in=new Scanner(System.in); 
        n=in.nextInt();
        for(int i=0;i<n;i++)
        {
          sum=sum+num;
          num=i+1;
          System.out.println(+sum);
        }
}}
