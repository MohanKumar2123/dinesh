import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    int no=in.nextInt();boolean count=true;
    for(int i=2;i<no/2;i++)
    {
        if(no%i==0)
        {
            count=false;break;
        }
    
    }
    if(count==false)
    {
                System.out.println("yes");

    }
    else
    {
        System.out.println("no");
    }}
}
