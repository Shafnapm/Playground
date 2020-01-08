import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int sqr=n*n;
      int temp=sqr;
      int c=0;
      int i=0;
      int var=0;
      int sum=0;
      while(sqr!=0)
      {
        sqr=sqr/10;
        c=c+1; 
    }
      sqr=temp;
      if(c==2)
      {
        int q=sqr/10;
        int r=sqr%10;
         sum=q+r;
       if(sum==n)
         System.out.println("Kaprekar Number");
       else
         System.out.println("Not A Kaprekar Number");
      }
      else if(c>2)
      {
        do
        {
          sqr=sqr/100;
          i=i+1;
        }while(i!=1);
        var=temp;
        var=var%1000;
        sum=sqr+var;
        if(sum==temp)
             System.out.println("Kaprekar Number");
        else
             System.out.println("Not A Kaprekar Number");
      }
      }
}