import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int sum=0;
      int sum1=0;
     // int temp=n;
      int r;
        while(n>0)
        {
          r=n%10;
          n=n/10;
        if(r%2==1)
         {
          sum=sum+r;
         }
          else
          {
            sum1=sum1+r;
          }
        }
       if(sum==sum1)
       {
         System.out.println("yes");
       }
      else
      {
        System.out.println("No");
      }
    }
}