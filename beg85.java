import java.util.*;
public class oddeven
{
     public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);
         String s=in.nextLine(),s1=" ",s2=" ";
         int n=s.length();char ch[]=s.toCharArray();
         for(int i=0;i<n;i++)
         {
             if((i+1)%2!=0)
             {
                 s1=s1+ch[i];
             }
             else
             {
                 s2=s2+ch[i];
             }
         }
        System.out.println(s1);
         System.out.println(s2);
     }
}
