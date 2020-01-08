import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         float x=sc.nextFloat();
         float y=sc.nextFloat();
         y=y*12;
      if(y==x)
      {
        float r=x-y;
        System.out.printf("No profit nor loss");
      }
      else if(y>x)
      {
        float l=x-y;
        System.out.printf("Profit : Rs.%.2f",l);
      }
      else
      {
        float l=x-y;
        System.out.printf("Loss : Rs.%.2f",l);
      }
    }
}
    