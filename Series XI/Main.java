import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      float f=95.0f;
      float b=20.5f;
      System.out.printf("%.1f ",f);
      for(int i=1;i<n;i++)
      {
         f=f+b;
        System.out.printf("%.1f ",f);
       b=b+2.0f;
      }
	}
}