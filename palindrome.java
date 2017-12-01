import java.util.*;
public class Palindrome
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int on,rn=0;
on=in.nextInt();
while(on>0)
{
gn=on%10;
on=on/10;
rn=on*10+gn;
}
if(rn==on)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
  }}}
