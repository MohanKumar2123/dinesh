import java.util.*;
public class sumarray
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
  
  int n=in.nextInt();
  int k=in.nextInt();
  int array[]=new int[n];
  int sum=0;
  for(int i=0;i<n;i++)
  {
      array[i]=in.nextInt();
  }
  for(int i=0;i<k;i++)
  {
  sum=sum+array[i];
  }
   System.out.println("sum of numbers in array\t"+sum);


}
}
