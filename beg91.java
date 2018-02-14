import java.util.*;
public class MyClass
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int l=in.nextInt(),b=in.nextInt(),h=in.nextInt();
        double surarea,vol;
        surarea=2*((l*b)+(b*h)+(l*h));
        vol=l*b*h;
        System.out.println(+surarea);
        System.out.println(+vol);
    }
}
