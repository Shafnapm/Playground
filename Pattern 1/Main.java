import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  int i,j,n,c=1;
     // int temp=n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      n=n*2;
      for(i=0;i<n;i++)
      {
        for(j=i;j<n-1;j++)
        {
        System.out.printf("%d ",c);
        c++;
      }
      System.out.print("\n");
      c=1;
      n=n-1;
      }
	}
}