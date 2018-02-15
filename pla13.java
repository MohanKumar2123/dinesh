import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class dinesh {
     public static void main(String args[]){
     Scanner in=new Scanner(System.in);
      int no=in.nextInt(),i,sum=0;
    while(no>0)
    {
        i=no%10;
        sum=sum+i*i;
        no=no/10;
    }
    System.out.println(+sum);
    }

}
