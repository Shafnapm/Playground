import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int a=1;
      int c=0;
    while(c<(num+1)/2)
     {
       System.out.println(a);
       a=a+2;
      c++;
     }
      
      
	}
}