import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=2;
      System.out.printf("%d ",a);
      int val=0;
      a=4;
      for(int i=1;i<n;i++)
      {
        val=(val+a)-1;
        System.out.printf("%d ",val);
         a=0;
        val=val*val;
      }
	}
}