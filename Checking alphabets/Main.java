import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
     char a=sc.next().charAt(0);
      if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')||(a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U'))
      {
         System.out.println("Vowel");
      }
         else if((a>=97)&&(a<=122))
         {    
       System.out.println("Consonant");
      }
      else 
      {
        System.out.println("Not an alphabet");
      }
    }
}