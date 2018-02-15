import java.util.*;
public class digit
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int no=in.nextInt();
int digit=0;
while(no!=0)
{
no/=10;
++digit;
}
System.out.println("no of digits\t"+digit);
}}
