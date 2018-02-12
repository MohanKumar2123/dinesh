import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int no1=in.nextInt(),no2=in.nextInt();
        for(int i=1;i<=no1&&i<=no2;i++)
        {
            if((no1%i==0)&&(no2%i==0))
            {
                System.out.println(+i);
            }
        }
     }
}
