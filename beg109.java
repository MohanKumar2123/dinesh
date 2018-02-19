import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int a,min=0;
        for(int i=1;i<=10;i++)
        {
            a=in.nextInt();
            if(i==1&&a>0)
            min=a;
            if(a<min)
            min=a;}
            System.out.println(min);
}}
