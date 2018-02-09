import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine(),r="";
    for(int i=s.length()-1;i>=0;i--)
    {
        r=r+s.charAt(i);
    }
    if(s.equals(r))
    {
        System.out.println("yes");
    }
    else
    {
        System.out.println("no");
    }
    }
}
