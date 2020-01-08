import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a=11;
      int sq=a*a;
      int b=0;
      System.out.printf("%d ",sq);
      int c=0;
      b=a+4;
      while(c<n-1)
      {
        sq=b*b;
        System.out.printf("%d ",sq);
        c++;
        b=b+4;
      }
	}
}