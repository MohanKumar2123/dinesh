import java.util.*;
class Vowel
{
public static void main(String args[])
{
char a;
System.out.println(" enter the character");
Scanner obj=new Scanner(System.in);
a=obj.next().charAt(0);
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
{
System.out.println("vowel");
}
else if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
{
System.out.println("consonant");
}else{
System.out.println("not alphabet");}
}
}
