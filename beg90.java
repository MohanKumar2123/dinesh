import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    char ch[]=s.toCharArray();
    for(int i=0;i<s.length();i++)
    {
        if(Character.isDigit(ch[i]))
        {
            System.out.print(ch[i]);
        }
    }
        
    }
}
