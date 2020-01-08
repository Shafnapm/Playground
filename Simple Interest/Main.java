import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int  b=sc.nextInt();
      int p=sc.nextInt();
      float r=sc.nextFloat();
      System.out.printf("%.2f",b*p*r/100);
    }
}