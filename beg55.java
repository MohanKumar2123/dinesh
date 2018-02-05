import java.util.*;
public class sum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int no1=in.nextInt(),no2=in.nextInt(),product;
        product=no1*no2;
        if(product%2==0)
        System.out.println("even");
        else
                System.out.println("odd");

    }
}
