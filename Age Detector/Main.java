import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int by,cy;
       by=sc.nextInt();
      cy=sc.nextInt();
      if(cy<by)
      {
          int y=(100-by)+cy;
       // int b=y+cy;
         System.out.println(y);
      }
      else
      {
      int age=cy-by;
      System.out.println(age);
      }
    }
}