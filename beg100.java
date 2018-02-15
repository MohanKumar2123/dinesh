import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    int no=in.nextInt(),i,pro=1;
    while(no>0)
    {
        i=no%10;
        pro=pro*i;
        no=no/10;
        
    }
        System.out.println(+pro);
    }
}
