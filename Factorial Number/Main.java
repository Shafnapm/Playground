import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i;
      int flag=0;
      int f=1;
      for(i=1;i<=n;i++)
      {
        f=f*i;
         if(f==n)
         {
          flag=1;
         }
      }
     if(flag==1)
     {
      System.out.println("Yes");
     }
      else
      {
         System.out.println("No");
      }
    }
}