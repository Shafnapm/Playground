/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
void l_elem(int list[],int size);
int main() {
   int size,list[10];
   scanf("%d",&size);
   for( int i= 0;i<size;i++)
   {
     scanf("%d", &list[i]);
   }
   l_elem(list,size);
   return 0;  
}
 void l_elem(int list[],int size)
 {
     int b1_sum=0,b2_sum=0;
     
     for(int i=0;i<size/2;i++)
     { 
       b1_sum=b1_sum+list[i];
     }  
     for(int i = size/2; i < size ; i++)
     { 
       b2_sum = b2_sum + list[i];
      
     }  
     
     if(b1_sum == b2_sum)
     {
         printf("Perfect Batch" );
     }
     else
     {
         printf("Not a Perfect Batch");
     }
 }
 