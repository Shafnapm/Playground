import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int s,l,b;
      float r;
      Scanner sc=new Scanner(System.in);
      s=sc.nextInt();
      l=sc.nextInt();
      b=sc.nextInt();
    //  sc.nextInt();
      r=sc.nextFloat();
      System.out.println(s*s);
      System.out.println(l*b);
      System.out.println(3.14*(r*r));
    }
}