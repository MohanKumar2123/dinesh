import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    int no=in.nextInt(),temp=1;
    for(int i=0;i<10;i++)
    {
        temp=temp*2;
        if(no<temp)
        {
            System.out.println(+temp);
            break;
        }
    }
    
    }
}
