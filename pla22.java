import java.util.*;
public class maxi
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int no1=in.nextInt(),no2=in.nextInt(),no;
        no=no1>no2?no1:no2;
        for(int i=2;i<no;i++)
        {
        if(no1%i==0&&no2%i==0)
        {
            System.out.println(i);break;
        }
    }}
}
