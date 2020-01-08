import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int b=s.nextInt();
  int q=a/b;
  int r=a%b;
  System.out.println("The number of students in each team is "+q+" and left out is "+r);
}
}