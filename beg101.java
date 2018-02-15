
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
   int no=in.nextInt(),count=0;
   while(no>0)
   {
       no=no/10;
       count++;
   }
     System.out.println(count);
    
}
}
