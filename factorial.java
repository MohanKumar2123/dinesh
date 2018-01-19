import java.util.*;
public class factorial
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int fact=1;
int no=in.nextInt();
for(int i=1;i<=no;i++)
{
fact=fact*i;
}
System.out.println("factorial number:"+fact);
}
}
