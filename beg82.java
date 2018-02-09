
import java.text.DecimalFormat;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    double len=in.nextDouble(),bre=in.nextDouble(),area;
    DecimalFormat dec=new DecimalFormat(".#####");
    area=len*bre;
     System.out.println(dec.format(area));
    }
}
