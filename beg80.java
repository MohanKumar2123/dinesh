import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    int no=in.nextInt();
    String s=Integer.toString(no);
    char a[]=s.toCharArray();
    for(int i=0;i<s.length();i++)
    if(a[i]%2!=0)
    {
        System.out.println(a[i]);
    }
    
    }
}
