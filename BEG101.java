import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int n=in.nextInt(),l;
        char ch[]=s.toCharArray();
        l=s.length();
        for(int i=n;i>=1;i--)
        {
            System.out.print(ch[l-i]);
        }
    }
}
