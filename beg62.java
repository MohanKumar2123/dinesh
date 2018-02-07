import java.util.*;
public class number
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();   boolean count=false;  
        char a[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if((a[i]=='1')||(a[i]=='0'))
            count=true;
        }
        if(count==true)
        System.out.println("yes");
        else
         System.out.println("no");

    }
}
