
import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int time1=in.nextInt();   
        int min1=in.nextInt();   
        int time2=in.nextInt();   
        int min2=in.nextInt();
        System.out.println(time1+":"+min1);    
        System.out.println(time2+":"+min2);
       int minutes1=time1*60+min1;
    int    minutes2=time2*60+min2;
       int wantedmin=minutes1-minutes2;
       int hours=wantedmin/60;
    int    minutes=wantedmin%60;
        
       System.out.println(hours+": "+minutes);
        
    }      

}
