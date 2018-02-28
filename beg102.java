import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class Div{
    int rec(int a){
    for(int i=a;i>1;i--)
  {
      if(a%2!=0)
      {
           System.out.println(a);break;
      }
      a=rec(a/2);
  }
  return 0;
    }
 public static void main(String args[]){
   Scanner in=new Scanner(System.in);
  int  a=in.nextInt();
 Div w=new Div();
 w.rec(a);
  }
}
