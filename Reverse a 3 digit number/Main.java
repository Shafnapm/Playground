import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int a=0,b=0,c=0;
      a=num/100;
    b=(num/10)%10;
    c=num%10;
      System.out.printf("%d%d%d",c,b,a);
  }
}