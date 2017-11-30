import java.util.*;
public class Largest{
int a,b,c;
public static void main(String args[]){
System.out.println("enter the numbers");
System.out.println(System.in);
Scanner obj= new Scanner();
a=obj.nextInt();
b=obj.nextInt();
c=obj.nextInt();
if((a>b)&&(a>c))
{
System.out.println("a is large");
}

else if(b>c)
{
System.out.println("b is large");
}
else{
System.out.println("c is large");
}}}
