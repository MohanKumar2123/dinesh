import java.util.*;
public class maxi
{
    static final int ascii=256;
    static char getMax(String s)
    {
        int count[] = new int[ascii]; char repchar=' '; 
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }
        int maxreno=0;
        for(int i=0;i<s.length();i++) 
        {
            if(maxreno<count[s.charAt(i)]) 
            {
                maxreno=count[s.charAt(i)];
                repchar= s.charAt(i);
            }
        }
      return repchar;
    }
     
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(getMax(s));
    }
}
