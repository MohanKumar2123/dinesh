import java.util.*;
public class special
{ public static void main(String[] args)
    {
        int n1=0,n2=1,n3, no;
        System.out.println(n1+" "+n2);
        Scanner in=new Scanner(System.in); 
        no=in.nextInt();
        for(int i=1;i<=no;i++)
        {
          n3=n1+n2;
          System.out.println(+n3);
          n1=n2;
          n2=n3;
        }
}}
