import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();
     // char val
        float tf,bf,hf;
        tf=sc.nextFloat();
        bf=sc.nextFloat();
        hf=sc.nextFloat();
        if(ch.equalsIgnoreCase("MSDS"))
        {
          float val=tf+bf;
          System.out.println(val);
        }
      else if(ch.equalsIgnoreCase("MSH"))
        {
          float val=tf+hf;
          System.out.println(val);
        }
      else if(ch.equalsIgnoreCase("MGSDS"))
        {
          float val=((150*tf)/100)+bf;
          System.out.println(val);
        }
      else
      {
        float val=((150*tf)/100)+hf;
          System.out.println(val);
      }
    }
}
 