import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a=1;
      for(int i=0;i<n;i++)
      {
      if(n%a==0)
      {
        System.out.println(a);
       
      }
         a++;
      }
	}
}