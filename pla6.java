import java.util.HashMap;
import java.util.*;
public class Good 
{
public boolean isIsomorphic(String s, String t)
{
    if(s==null||t==null)
        return false;
    if(s.length()!=t.length())
        return false;
    HashMap<Character, Character> map = new HashMap<Character, Character>();
    for(int i=0; i<s.length(); i++)
    {
        char c1 = s.charAt(i);
        char c2 = t.charAt(i);
        if(map.containsKey(c1))
        {
          
            if(map.get(c1)!=c2)
                return false;
        }
        else
        {
            if(map.containsKey(c2))
                return false;
                map.put(c1, c2);
        }
    }
return true;
}
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine(),t=in.nextLine();
        Good d=new Good();
        if(d.isIsomorphic(s,t))
            System.out.println("yes");
        else
            System.out.println("No");
 }
}
