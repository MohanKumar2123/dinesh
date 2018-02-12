import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int no1=in.nextInt(),no2=in.nextInt(),lcm=no1>no2?no1:no2;
        while(true)
        {
            if((lcm%no1==0)&&(lcm%no2==0))
            {
                System.out.println(+lcm);break;
            }
        lcm++;
        }
     }
}
