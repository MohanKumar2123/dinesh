
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
   int N=in.nextInt(),K=in.nextInt(),a[]=new int[N],i;
   for(i=0;i<N;i++)
   {
       a[i]=in.nextInt();
   }
   Arrays.sort(a);
System.out.println(a[K-1]);
}}
