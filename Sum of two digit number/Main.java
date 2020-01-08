import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int q=0,r=0,sum=0;
      q=num/10;
      r=num%10;
      sum=q+r;
      System.out.println(sum);
	}
}