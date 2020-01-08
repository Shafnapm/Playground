import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a=6,x=5,val=0;
      int c=0;
      System.out.printf("%d",a);
     do
      {
         val=a+x+val;
        System.out.printf(" %d",val);
       c++;
        x=x+5;
       a=0;
      }while(c<n-1);
	}
}