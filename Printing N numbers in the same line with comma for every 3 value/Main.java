import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int c=0;
    for(int i=1;i<=n;i++)
    {
      System.out.printf("%d",i);
        c++;
        if(c>=3)
        {
          System.out.printf(",");
          c=0;
        }
     
      }
    
  }
}