import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int s1,s2,s3;
      s1=s.nextInt();
      s2=s.nextInt();
      s3=s.nextInt();
      String a=s.nextLine();
      if((s1>s2)&&(s1<s3))
      {
       System.out.println("L1");
      }
     else if((s2>s1)&&(s2<s3))
      {
       System.out.println("L2");
      }
      else
      {
       System.out.println("L3");
      }
    }
}