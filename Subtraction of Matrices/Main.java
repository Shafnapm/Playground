#include<stdio.h>
int main()
{
	int i,j,n,m;
  int sub[n][m];
  scanf("%d%d",&n,&m);
  int a[n][m];
  int b[n][m];
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      scanf("%d",&a[i][j]);
    }
   
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      scanf("%d",&b[i][j]);
    }
    
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      sub[i][j]=a[i][j]-b[i][j];
      printf("%d ",sub[i][j]);
    }
    printf("\n");
  }
	return 0;
}