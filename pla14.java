import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class dinesh {
     public static void main(String args[]){
     Scanner in=new Scanner(System.in);
      String s=in.nextLine(),s1; s1=s.replaceAll("[aeiouAEIOU]","");
      StringBuilder ss=new StringBuilder();
      ss.append(s1);
     for(int i=ss.length()-1;i>=0;i--)
     {
               System.out.print(ss.charAt(i));
}}}
