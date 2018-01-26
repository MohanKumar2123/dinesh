import java.util.*;
public class Numeric {

public static void main(String[] args) {
Scanner in=new Scanner(System.in);
        
        String val;
        val=in.nextLine();
        boolean numeric = true;

        try {
            Double dinesh = Double.parseDouble(val);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println(" yes");
        else
            System.out.println(" no");
    }
}
