#include<stdio.h>
int main()
{
 int i,count=0;
  int ar_sz;
  scanf("%d", &ar_sz);
  int arr[20];
  for(int i=0;i<=ar_sz-1;i++)
  {
    scanf("%d", &arr[i]);
  }
  for(i=0;i<ar_sz;i++)
  {
    if(arr[i]>0)
    {
      arr[count++]=arr[i];
    }
  }
  while(count<ar_sz)
  {
    arr[count++]=0;
  }
  for(i=0;i<ar_sz;i++)
  {
    printf("%d ",arr[i]);
  }
  return 0;
}