import java.util.*;
public class special
{ public static void main(String[] args)
    {
        int n1=0,n2=1,n3, n;
        System.out.println(n1+" "+n2);
        Scanner in=new Scanner(System.in); 
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
          n3=n1+n2;
          System.out.println(+n3);
          n1=n2;
          n2=n3;
        }
}}
