import java.util.Scanner;
public class arithmeticpro
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);int sum=0;int n=0;
        int a1=in.nextInt(),diff=in.nextInt(),totno=in.nextInt();
         while(totno!=(n-1))
        {
             sum=a1+(n-1)*diff;n++;
        }
        System.out.println("sum of n th element"+sum);
        
    }
}
