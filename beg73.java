import java.util.*;
public class vowel
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
       int no=in.nextInt(),no1=in.nextInt(),no2=in.nextInt();
       boolean count=true;
       for(int i=no1;i<=no2;i++)
       {
           if(i==no)
           {
               count=false;
           }
       }
       if(count==true)
       {
           System.out.println("no");
       }
       else
       {
           System.out.println("yes");
       }
}}
