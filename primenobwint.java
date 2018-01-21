import java.util.Scanner;
public class Primenobwint
{
    public static void main(String args[])
    {
         int no1, no2 , i, j;
         Scanner in = new Scanner(System.in);boolean dinesh=false;
         no1 = in.nextInt();
         no2 = in.nextInt();
         for(i = no1; i <= no2; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     dinesh=false;
                     break;
                 } else
                 {
                     dinesh=true;
                 }
                
             }
             if(dinesh==true)
             {
                 System.out.println(i);
             }
         }
    }
}
