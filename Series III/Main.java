import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int c=0;
      int a=3;
      System.out.printf("%d",a);
     while(c<n-1)
      {
       a=a*3;
       System.out.printf(" %d",a);
       c++;
      }
	}
}