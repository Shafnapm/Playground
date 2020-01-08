import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main
{
    public static void main(String args[])throws NumberFormatException,IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n1=Integer.parseInt(br.readLine());
      int n2=Integer.parseInt(br.readLine());
      System.out.println(n1*n2);
       System.out.println(n1/n2);
       System.out.println(n1%n2);
    }
}