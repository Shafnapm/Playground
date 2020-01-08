import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int n=s.nextInt();
    // string m=s.nextLine();
     String re= n%2==0 ? "Even":"Odd" ;
      System.out.println(re);
    }
}