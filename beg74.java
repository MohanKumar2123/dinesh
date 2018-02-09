import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    double no=in.nextDouble();
    for(int i=0;i<10;i++)
    {
        no=no+0.1;
        if(no%1==0)
        {
            int n=(int)no;
            System.out.println(+n);
            break;
        }
    }
    
    }
}
