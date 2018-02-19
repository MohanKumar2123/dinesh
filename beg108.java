import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt(),sum=0;
        for(int i=1;i<=c;i++)
        {
            sum=sum+b;
            b=b+a;
        }
        System.out.println( sum);
}}
