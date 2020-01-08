import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
      int c=0;
       while(n!=0)
       {
         n=n/10;
         c=c+1;
       }
      if(c==3)
      {
      if((n==(n/10)%10))
      {
        if(n%3==0)
        {
           System.out.println("Trendy Number");
        }
       }
      }
      else 
        {
          System.out.println("Not a Trendy Number");
        }
        
      
         }   
}