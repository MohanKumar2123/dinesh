import java.lang.*;
public calss digit
{
public satic void main(String[] args)
{
Scanner in=new scanner(System.in);
int no=in.nextInt();
int digit=0;
while(no!=0)
{
no/=10;
++digit;
}
System.out.println("no of digits"+digit);
}}
