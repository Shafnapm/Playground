import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int c=1;
      for(int i=1;i<=n;i++)
      {
        for(int sp=1;sp<=n-i;sp++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
         System.out.print(c + " ");
          c++;
        }
        System.out.printf("\n");
      }
    }    
}