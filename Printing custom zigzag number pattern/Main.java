#include <stdio.h>
int main()  
{
	int n,i,j;
  scanf("%d", &n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n;j++)
    {
      if(((i%2==0 ) && (j==1)) || ((i%2==1) && (j==n)))
         {
           printf("%d",i+1);
         }
         else
         {
           printf("%d",i);
         }
         }
         printf("\n");
         }
  return 0;
}