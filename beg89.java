import java.util.*;
import java.util.ArrayList;
public class mycla
{
     public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);
        }
    }
    }
