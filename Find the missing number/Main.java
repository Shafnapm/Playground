#include<stdio.h>
int main()
{
 int n;
  scanf("%d", &n);
  int arr1[n],arr2[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d", &arr1[i]);
  }
  for(int i=0;i<=n;i++)
  {
    arr2[i]=i+1;
  }
  
  for(int i=0;i<n;i++)
  {
   int c=0;
    for(int j=0;j<=n;j++)
    {
    if(arr2[i]==arr1[j])
      c=1;
    }
    if(c!=1)
    {
      printf("%d",arr2[i]);
    }
}
  return 0;
}