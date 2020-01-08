#include<stdio.h>
int sub_arr(int arr_size, int arr[], int sum_arr[]);
int main()
{
    int n;
	scanf("%d",&n);
    int a[n];
    for(int i= 0;i < n; i++)
    {
        scanf("%d", &a[i]);   
    }
    int sum_arr[3 *n];
    sub_arr(n, a, sum_arr);
    return 0;
}    
int sub_arr(int n, int a[], int sum_arr[])
{
	for(int j = 0; j <= n - 1;j++)
    {
        int k =  a[j];
        int s= 1;
        for(int x= j+1; x<=n-1;x++)
        {
            if(a[x]>k)
            {
                for(int y= j; y<=x; y++)
                {
                    if(a[y]>a[x])
                    s = 0;
                }
                if(s == 1)
                printf("%d,%d\n", k, a[x]);
            }
            s = 1;
        }
    }
    return 0;
}