import java.util.*;
import java.util.ArrayList;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
     String s=in.nextLine(),ss="";
     s=" "+s;
     for(int i=0;i<s.length();i++)
     {
         char a=s.charAt(i);
         if(a==' ')
         {
             ss=ss+" ";char b=s.charAt(i+1);
             ss=ss+Character.toUpperCase(b);
            i++;
         }
         else
         {
             ss=ss+a;
         }
     }

 System.out.println(ss);
    }
}
