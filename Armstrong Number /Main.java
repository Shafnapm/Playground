import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int c=0;
      int r=0;
      int temp=n;
      int b=0;
      while(n!=0)
      {
       n=n/10;
        c++;
      }
      n=temp;
      while(n!=0)
      {
         r=n%10;
        int a=1;
      for(int i=0;i<c;i++)
      {
        a=a*r;
      }
        b=b+a;
        n=n/10;
      }
      // System.out.println(b);
      if(b==temp)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}