import java.util.*;
public class special
{
public  static void main(String args[]) 
{
Scanner in=new Scanner(System.in);  
String s=in.nextLine();
int i,c1=0,c2=0,c3=0,sp=0;
char ch[];
for(i=0;i<s.length();i++)
{
ch=s.toCharArray();
if(Character.isLetter(ch[i]))
++c1;
else if(Character.isDigit(ch[i]))
++c2;
else if(ch[i]==' ')
++c3;
else
++sp;
}
System.out.println("no of specialSymbol="+sp);
}
}
