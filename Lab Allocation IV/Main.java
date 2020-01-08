import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
       int s1,s2,s3,n;
       s1=sc.nextInt();
       s2=sc.nextInt();
       s3=sc.nextInt();
       n=sc.nextInt();
      int c=0;
      if(n<s3)
      {
       System.out.println("L3");
      }
        else if(n<s2)
        {
           System.out.println("L2");
        }
          else 
          {
              System.out.println("L1");
          }  
        
      //System.out.println(c);
    }
}