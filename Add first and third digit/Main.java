import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int a=0,b=0,sum=0;
      a=num/100;
      b=num%10;
      sum=a+b;
      System.out.println(sum);
	}
}