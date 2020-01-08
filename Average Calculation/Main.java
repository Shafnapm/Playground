import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        float m1,m2,m3,m4,m5;
     float sum=0,avg=0;
      Scanner sc=new Scanner(System.in);
      m1=sc.nextFloat();
       m2=sc.nextFloat();
       m3=sc.nextFloat();
       m4=sc.nextFloat();
       m5=sc.nextFloat();
      sum=m1+m2+m3+m4+m5;
      avg=sum/5;
      System.out.printf("%.2f",avg);
    }
}