import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n=in.nextInt();
      int i,j;
      int val=0;
      for(i=1;i<=n;i++)
      {
        //val=0;
        for(j=1;j<=i;j++)
            {
              if(val==0)
              {
                System.out.printf("*");
                val++;
              }
        else if(val==1)
          {
            System.out.printf("#");
          val=0;
          }
            }
        System.out.printf("\n");
            }
    }
}