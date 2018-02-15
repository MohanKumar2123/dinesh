
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
   int N=in.nextInt(),K=in.nextInt(),a[]=new int[N],no=0;
   boolean count=false;
   for(int i=0;i<N;i++)
   {
       a[i]=in.nextInt();
      if(a[i]==K)
      {
      count=true;no++;
   }}
   if(count==true)
       {
            System.out.println(+no);
       }
       else{
            System.out.println("no is not here");
       }}
}
