import java.util.Scanner;

public class armstrongnobwint
{
    public static void main(String args[])
    {
        int n, n1, n2, i, rem, temp;
        Scanner in= new Scanner(System.in);
        n1 = in.nextInt();
        n2 = in.nextInt();
        for(i=n1+1; i<n2; i++)
        {
            temp = i;n=0;
            while(temp != 0)
            {
                rem = temp%10;
                n = n + rem*rem*rem;
                temp = temp/10;
            }
            if(i== n)
            {
               
               
            System.out.println(+i);
        }}
        
    }
}
