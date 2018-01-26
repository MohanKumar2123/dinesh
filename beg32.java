import java.util.*;
public class Numeric {

public static void main(String[] args) {
Scanner in=new Scanner(System.in);
        int count=0;
String s1;
        s1=in.nextLine();
       for(int i=1;i<=s1.length();i++){
           if(((s1.charAt(i))==" ")&&((s1.charAt(i+1))!="")){
               count++;
           }
       }
        
            System.out.println(+count);
        
    }
}
