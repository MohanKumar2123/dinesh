import java.util.Scanner;
public class maxarray
{
    public static void main(String[] args) 
    {
        int n, temp,i;
        Scanner s = new Scanner(System.in);
       // System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
       // System.out.println("Enter all the elements:");
        for ( i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
       for(  i=0;i<n;i++)
       {
           System.out.print(+a[i]);System.out.print("  ");
            System.out.println(+i);
       }
       
    }
}
