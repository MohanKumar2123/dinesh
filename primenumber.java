import java.util.Scanner;
public class primenumber
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);boolean dinesh=true;
        int no=in.nextInt();
        for(int i=2;i<no;i++)
        {
        if(no%i==0)
        {
            dinesh=false;
           break;
        }}
        if(dinesh==true){System.out.println("  prime number");
            
        }
        
        else{
             System.out.println(" not prime number");
        }
        
        
        
    
        
    }
}
