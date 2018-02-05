import java.util.*;
public class sum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        count(s);
        
    }
        public static void count(String x)
        {
            char ch[]=x.toCharArray();      
            boolean s1=false,s2=false;
            for(int i=0;i<x.length();i++)
            {
            if(Character.isLetter(ch[i]))        
            {
            s1=true; 
            }
            else if(Character.isDigit(ch[i]))
            {
            s2=true;
            }
          
            }
            if((s1==true)&&(s2==true))
            {
            System.out.println("yes");
            }
            else
            {
            System.out.println("no");
        }}
        
    

    
}
