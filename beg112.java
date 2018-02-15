
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
   int N=in.nextInt(),K=in.nextInt(),a[]=new int[N];
   boolean count=false;
   for(int i=0;i<N;i++)
   {
       a[i]=in.nextInt();
      if(a[i]==K)
      {
      count=true;break;
   }}
   if(count==true)
       {
            System.out.println("yes");
       }
       else{
            System.out.println("no");
       }}
}
