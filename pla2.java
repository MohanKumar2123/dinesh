import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    int no=in.nextInt(),fact=1,i;
    for( i=no;i>=1;i--)
    {
        fact=fact*i;
    }
        System.out.println(+fact);
    }
}
