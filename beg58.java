import java.util.*;
public class special
{
public  static void main(String args[]) 
{
Scanner in=new Scanner(System.in);  
int no1=in.nextInt();
int no2=in.nextInt();
no1=no1^no2;
  no2=no1^no2;
  no1=no1^no2;
System.out.println(+no1);
System.out.println(+no2);
}
}
