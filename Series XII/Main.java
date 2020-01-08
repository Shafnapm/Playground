import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a=9;
      int b=11,c=20,sum=0;
      System.out.printf("%d %d %d ",a,b,c);
      for(int i=1;i<n-2;i++)
      {
       a=b+c;
         System.out.printf("%d ",a);
        b=c;
        c=a;
       
      // b=0;
       
      }
 
	}
}