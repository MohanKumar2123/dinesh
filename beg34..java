import java.util.*;
public class Numeric {

public static void main(String[] args) {
Scanner in=new Scanner(System.in);
        int count=1;
String s;
        s=in.nextLine();
       for(int i=0;i<s.length()-1;i++){
         	if ((s.charAt(i) == '.') && (s.charAt(i + 1) != ' '))
{
               count++;
           }
       }
        
            System.out.println(+count);
        
    }
}
