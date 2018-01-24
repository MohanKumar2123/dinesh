import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int min=in.nextInt();
       int hours,minutes;
       hours=min/60;
       minutes=min%60;
       System.out.println(hours+": "+minutes);
        
    }
}
