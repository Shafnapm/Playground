import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0;
      int b=0;
      int c=0;
      int d=1;
      //System.out.printf("%d",a);
     // System.out.printf(" %d",b);
       //System.out.printf(" %d",c);
      for(int i=0;i<n;i++)
      {
        a=b;
        b=c;
        c=d;
        d=a+b+c;
        System.out.printf("%d ",a);
      }
      
    }
}