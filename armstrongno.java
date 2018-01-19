import java.util.*;
public class armstrong
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int no=in.nextInt();
int sum=0;
int i;
int temp=0;
temp=no;
while(no>0)
{
 i=no%10;
sum=sum+i*i*i;
no=no/10;
}
if(temp==sum)
{
System.out.println("armstrong number");
}
else
{
System.out.println("not an armstrong numbers ");
}
}
}
