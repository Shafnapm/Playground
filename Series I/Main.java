import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int c=1;
      int d=0;
     while(c<=n)
     {
      
       d=c*c;
       System.out.printf("%d ",d);
       c++;
     }
	}
}