import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int base=s.nextInt();
      int exp=s.nextInt();
      int c=1;
      while(exp!=0)
      {
       c=c*base;
       exp--;
      }
      System.out.println(c);
    }
}