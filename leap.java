import java.util.*;
class Leap
{
public static void main(String args[])
{
int a;
System.out.println(" enter the number");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
if(a%4==0)
{
System.out.println("leap year");
}
else
{
System.out.println("not leap year");
}
}
}
