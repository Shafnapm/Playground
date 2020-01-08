import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a=4;
      int b=1,d=0;
      int val=0;
      int c=1;
      System.out.printf("%d ",a);
     // System.out.printf("%d ",val);
      val=a+b;
     while(c<n)
      {     
       System.out.printf("%d ",val);
         b=b+1;
         d=b*b;
         val=val+d; 
       c++;
      }
	}
}