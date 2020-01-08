import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int sum=0;
      int a=num/10;
      int b=num%10;
       sum=a+b;
      System.out.println("Alice must go in path-"+sum);
	}
}