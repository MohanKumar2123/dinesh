import java.util.*;
public class Numeric {

public static void main(String[] args) {
Scanner in=new Scanner(System.in);
        int count=1;
String t;
        t=in.nextLine();
       for(int i=0;i<t.length()-1;i++){
         	if ((t.charAt(i) == ' ') && (t.charAt(i + 1) != ' '))
{
               count++;
           }
       }
        
            System.out.println(+count);
        
    }
}
