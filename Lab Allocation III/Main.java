import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int s1,s2,s3,n;
       s1=s.nextInt();
       s2=s.nextInt();
       s3=s.nextInt();
       n=s.nextInt();
      int c=0;
      if(s1>n)
      {
        c=c+1;
        if(s2>n)
        {
          c++;
          if(s3>n)
          {
            c++;
          }
            
        }
    }
      System.out.println(c);
    }
}