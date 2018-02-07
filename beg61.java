import java.util.*;
public class number
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();     
        int k=in.nextInt();
        char a[]=s.toCharArray();
        for(int i=0;i<k;i++)
        {
            System.out.print(a[i]);
        }
    }
}
