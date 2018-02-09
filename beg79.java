import java.util.*;
public class number
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int no1=in.nextInt(),no2=in.nextInt(),pro;
       pro=no1*no2;
            if(pro/no1==no1)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no"); 
            }
        
    }
}
