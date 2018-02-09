import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    int no=in.nextInt(),temp;
    for(int i=0;i<10;i++)
    {
        no=no+1;
        if(no%10==0)
        {
            System.out.println(+no);
            break;
        }
    }
    
    }
}
