import java.lang.*;
public class palindrome
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int no=in.nextInt();
int revno=0;
while(no>0)
{
revno=revno*10+no%10;
no=no/10;
}
if(revno==no)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}}
