#include<stdio.h>
int main()
{
 int ar_sz;
  scanf("%d", &ar_sz);
   int arr[ar_sz];
   for(int i=0;i<=ar_sz-1;i++)
   {
     scanf("%d", &arr[i]);
    // printf("%d",arr[i]);
   }
   for(int i_1=0;i_1<=ar_sz-2;i_1++)
   {  
      for(int i_2=i_1+1;i_2<=ar_sz-1;i_2++)
      {
         for(int i_3=i_2+1;i_3<=ar_sz-1;i_3++)
         {
           printf("(%d, %d, %d) ", arr[i_1],arr[i_2],arr[i_3]);
         }
      }
     printf("\n");
   }
 // return 0;
}