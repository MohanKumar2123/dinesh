import java.util.*;
public class Alphabet
{
public static void main(String args[])
{
char a;
System.out.println(" enter the character");
Scanner obj=new Scanner(System.in);
a=obj.next().charAt(0);
 if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
{
System.out.println("alphabet");
}else{
System.out.println("not alphabet");}
}
}
