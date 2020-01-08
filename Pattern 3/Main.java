import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i,j,a=1;
      int temp=a;
      for(i=0;i<n;i++)
      { 
        for(j=i;j<n;j++)
        {
          if(a%2==1)
          {
          System.out.print(a+" ");
             a+=2;
        }
        }
        System.out.println();
        temp+=2;
        a=temp;
      }
	}
}