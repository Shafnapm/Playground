import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();
     //  System.out.println(n);
     int a;
      int c=0;
      int d=0;
      int sum=0;
      do
      {
       a=s.nextInt();
        if(a>0)
        {
          c++;
        }
        else if(a<0)
        {
         d++;
        }
        sum=c+d;

      }while(sum!=n);
      System.out.println("Number of positive numbers is "+c+" and the number of negative numbers is "+d);
    }
}