
  #include<stdio.h>
int main()
{
        int ar_sz;
        scanf("%d",&ar_sz);
        int arr[10];
        for(int i=0;i<=ar_sz-1;i++)
        {
            scanf("%d",&arr[i]);
        }
      
        int s_el_1;
        scanf("%d",&s_el_1);
        int s_el_2;
        scanf("%d",&s_el_2);
        int elem1_i= -1;
        int elem2_i= -1;
        for(int i= 0; i<=ar_sz-1; i++)
        {
            if(s_el_1 == arr[i])
            {
                elem1_i=i;
            }
            if(s_el_2==arr[i])
            {
                elem2_i=i;
            }
        }
        printf("%d\n",elem1_i);
        printf("%d\n",elem2_i);
    return 0;
}
 