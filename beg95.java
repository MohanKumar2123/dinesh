import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    int amount=in.nextInt(),timemon=in.nextInt(),rate=in.nextInt(),interest,t;
    t=amount/100;
    interest=t*timemon*rate;
    
        System.out.println(+interest);
    }
}
