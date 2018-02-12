import java.io.*;
import java.util.*;
public class mycla
{
    static boolean isogram(String s)
    {
        s = s.toLowerCase();
        int len = s.length();
        char ch[] = s.toCharArray();
         Arrays.sort(ch);
        for(int i = 0;i < ch.length-1;i++)
        {
            if(ch[i] == ch[i+1])
                return false;
        }
        return true;
    }
     
    public static void main (String[] args) 
    {
        Scanner in=new Scanner(System.in);
        String s = in.next();
        if(isogram(s))
               System.out.println("yes");
        else
              System.out.println("no");
 }
}
 

