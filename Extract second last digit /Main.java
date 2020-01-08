import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int a=0;
      a=(num%100)/10;
      System.out.println(a);
	}
}