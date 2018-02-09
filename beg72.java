import java.util.*;
public class vowel
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        boolean count=true;
        char ch[]=s.toCharArray();char a[]={'a','e','i','o','u'};
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(a[i]==ch[j])
                {
                    count=false;break;
                }
                  }}
        if(count==true) {
                    System.out.println("no");
                }
                else
                {
                    System.out.println("yes");
                }
    
}}
