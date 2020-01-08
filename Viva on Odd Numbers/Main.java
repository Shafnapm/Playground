import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    float score=0.0f;
     int c=0;
     int n;
       do
       {
         n=sc.nextInt();
         if(n<0)
         {
           score=(float)(score-1.0);
          // c++;
          // break;
         }
          else if(n%2==1)
           {
               score++;
                c++;
           }
           else
           {
               score=(float)(score-0.5); 
               //c++;
           }
          }
      while(n>0&&c!=3);
      System.out.printf("%.1f",score);
    }
}