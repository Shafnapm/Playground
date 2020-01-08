import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int m=s.nextInt();
      int sum=0;
      int prod=0;
      int tot=0;
      while(n!=m)
      {
          int r=n%10;
           int q=n/10;
          sum=r+q;
         prod=r*q;
         tot=sum+prod;
        if(tot==n)
        {
          System.out.println(tot);
        }
        n++;
      }
    }
}