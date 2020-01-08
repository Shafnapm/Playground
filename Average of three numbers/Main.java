import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
       int n1,n2,n3,sum=0,avg=0;
      n1=s.nextInt();
      n2=s.nextInt();
      n3=s.nextInt();
      sum=n1+n2+n3;
      avg=sum/3;
      System.out.println(avg);
	}
}