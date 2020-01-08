import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
    
    // System.out.printf("%d ",a);
      int c=1;
      int val=0;
   
      while(c<=n)
      {
        if(c%2==0)
        {
         val=(c*c-2);
     
         // c++;
        }
        else
        {
        val=(c*c-1);
        //val=a-1;
        }
        System.out.printf("%d ",val);
        c++;
    }
	}
}