import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
     float f=2.0f,f1=1.0f;
      int a=1;
      System.out.printf("%d ",a);
      System.out.printf("%.1f ",f);
      for(int i=0;i<(n/2)-1;i++)
      {
        f1=f1*3;
        f=f*3;
        System.out.printf("%.1f %.1f ",f1,f);
      }
	}
}