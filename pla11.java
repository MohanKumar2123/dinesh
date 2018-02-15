import java.util.*;
public class digit
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
String s[]={"monday","tuesday","wednesday","thursday","friday","saturday"},ss=in.nextLine();
boolean count=true;
for(int i=0;i<s.length;i++)
{
    if(s[i].equals(ss))
    {
       count=false;
}
}
if(count==true)
{
      System.out.println("holiday");
}
else{
      System.out.println("workingday");
}
}}
