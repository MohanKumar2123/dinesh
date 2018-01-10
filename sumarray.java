import java.lang.*;
public class sumarray
{
public staic void main(String args[])
{
Scanner in=new Scanner(System.in);
  
  int n=in.nextInt();
  int k=in.nextInt();
  int array[]=new int[n];
  int sum=0;
  for(n=0;n<k;n++)
  {
  sum=sum+array[k];
  }
   System.out.println("sum of numbers in array"+sum);


}
}
