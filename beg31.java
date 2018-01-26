import java.util.*;
public class Numeric {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s1,s2;
s1=in.nextLine();
s2=s1.replaceAll(" ","");
System.out.println(+s2.length());    }
}
