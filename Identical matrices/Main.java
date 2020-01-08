#include<stdio.h>
int main()
{
int r1,c1;
  int i,j;
  scanf("%d%d",&r1,&c1);
  int a[r1][c1];
  int flag=0;
  for(int i=0;i<r1;i++)
  {
    for(int j=0;j<c1;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  
  //int r2,c2;
 // scanf("%d%d",&r2,&c2);
  int b[r1][c1];
   for(int i=0;i<r1;i++)
  {
    for(int j=0;j<c1;j++)
    {
      scanf("%d",&b[i][j]);
    }
  }
 for(int i=0;i<r1;i++)
  {
    for(int j=0;j<c1;j++)
    {
     if(a[i][j]!=b[i][j])
     {
        flag=1;
        break;
      }
    }
  } 
  if(flag==1)
  {
    printf("No");
  }
  else
  {
    printf("Yes");
  }
return 0;
}