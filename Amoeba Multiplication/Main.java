import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int i,a=0;
      int b=0;
      int c=1;
      // System.out.println(a);
      //System.out.println(b);
      for(i=1;i<=n;i++)
      {
       // f=f+1;
        a=b;
        b=c;
        c=a+b;
      }
      System.out.println(a);
    }
}