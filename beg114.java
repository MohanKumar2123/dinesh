
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
   int N=in.nextInt(),K=in.nextInt(),a[]=new int[N],i,count=0;
   for(i=0;i<N;i++)
   {
       a[i]=in.nextInt();
   }
   for(i=0;i<N;i++)
   {
       if(a[i]%2!=0)
       {
           count++;
           if(count==K)
           {
               System.out.println(a[i]);break;
           }
       }
   }
   }}
