import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
     Scanner in=new Scanner(System.in);
     String s1=in.nextLine(),s2=in.nextLine();
     int a,b,count=0;
     for(int i=0;i<s1.length()&&i<s2.length();i++)
     {
     a=s1.charAt(i);;b=s2.charAt(i);
     if(a>b)
     {
          count =1;break;
     }
     else
     {
        count=-1;break;
     }
        
     }
     if(count==1)
     {
         System.out.println(s1);
     }
     else if(count==-1)
     {
         System.out.println(s2);
     }
     else
     {
         System.out.println(s1);
     }
        
    }
}
