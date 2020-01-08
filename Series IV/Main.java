import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      float a=0.5f;
      int f=3;
      int c=0;
      System.out.printf("%.1f ",a);
      a=a+1;
     // System.out.printf("%.1f ",a);
      while(c<n-1)
      {
        System.out.printf("%.1f ",a);
         a=a+f;
         f=f*3;
        c++;
      }
	}
}