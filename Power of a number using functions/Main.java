import java.util.Scanner;
import java.lang.Math;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int b,e;
    b=s.nextInt();
    e=s.nextInt();
    int c=pow(b,e);
    System.out.println(c);
  }
  public static int pow(int a,int b)
  {
    System.out.print(Math.pow(a,b));
    return 0;
  }

}