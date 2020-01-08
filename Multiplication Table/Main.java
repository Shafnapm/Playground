import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int n1,n2;
      int val=0;
      n1=s.nextInt();
      n2=s.nextInt();
      int a=1;
      do
      {
        val=a*n1;
        System.out.println(a+"*"+n1+"="+val);
        a++;
        
      }while(a<=n2);
    }
}