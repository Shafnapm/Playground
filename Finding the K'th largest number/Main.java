#include<stdio.h>
int main()
{
        int n;
        scanf("%d",&n);
        int arr[10];
        for(int i = 0; i<= n - 1; i++)
        {
            scanf("%d", &arr[i]);
        }
      int k;
        scanf("%d", &k);
        sort(n, arr);
        printf("%d",arr[n-k]);
    return 0;
}
     void sort(int n, int arr[])
    {
        for(int s_i = 0; s_i <= n - 2; s_i++)
        {
            int m_i = f_m_i(s_i, arr, n-1);
            swap(s_i, m_i, arr);
        }
    }
      void swap(int s_i, int  m_i, int arr[])
      {
         int temp = arr[s_i];
         arr[s_i] = arr[ m_i];
         arr[ m_i] = temp;
     }
     int f_m_i(int s_i, int arr[], int end_idx)
     {
         int  m_i= 0;
         if(arr[s_i] < arr[s_i + 1])
         {
              m_i= s_i;
         }
         else
         {
              m_i =s_i + 1;
         }
         for(int i = s_i + 2; i <= end_idx; i++)
         {
             if(arr[ m_i] > arr[i])
             {
                 m_i = i;
             }
         }
         return   m_i;
     }