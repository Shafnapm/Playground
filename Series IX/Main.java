import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a=2,val=0,b=13,c=1;
       System.out.printf("%d ",a);
      for(int i=1;i<n;i++)
      {
        val=val+a+(b*c);
        System.out.printf("%d ",val); 
        a=0;c++;
      }
	}
}