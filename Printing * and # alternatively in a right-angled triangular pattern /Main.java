#include <stdio.h>
int main() 
{
	int n,i,j;
  scanf("%d", &n);
  int sh=0;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(sh==0)
      {
        printf("*");
        sh=1;
      }
      else{
        printf("#");
        sh=0;
      }
    }
    printf("\n");
  }
return 0;
}