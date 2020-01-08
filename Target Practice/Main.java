import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      //System.out.println(n);
      int c;
      int i=0;
      int sum=0;
      do
      {
        c=s.nextInt();
        sum=sum+c;
       i++;
         // System.out.println("The number of turns is "+i);
       
      }while(sum<n);
      System.out.println("The number of turns is "+i);
    }
}