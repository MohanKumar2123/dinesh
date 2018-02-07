import java.util.*;
public class number
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
     int no1=in.nextInt(),no2=in.nextInt(),sum;
     sum=no1+no2;
        if(sum%2==0)
        System.out.println("even");
        else
         System.out.println("odd");
    }
}
