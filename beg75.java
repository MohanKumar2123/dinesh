import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);String s=in.nextLine();
        StringBuffer s1=new StringBuffer();
        s1.append(s);
        int n=s1.length();
        if(n%2!=0)
        {
            s1.setCharAt(n/2,'*');
            System.out.println(s1);
        }
        else{
            s1.setCharAt((n/2-1),'*');
           s1.setCharAt(n/2,'*');
            System.out.println(s1);
            
        }

        
    }
}
