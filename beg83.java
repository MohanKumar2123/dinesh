
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    for(int i=1;i<=3;i++)
    {
     double no1=in.nextDouble();char a=in.next().charAt(0);double no2=in.nextDouble(),n;
     switch(a)
     {
         case'+':
           n=no1+no2;
           break;
         case '-':
               n=no1-no2;
               break;
          case '*':
              n=no1*no2;
              break;
         case '/':
             n=no1/no2;
             break;
         default:
             n=no1%no2;
     }
     System.out.println(n);
    }
}
}
