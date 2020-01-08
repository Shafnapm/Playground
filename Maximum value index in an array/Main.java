// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
void l_elem(int list[],int max_ele);
int main() {
   int max_ele,list[10];
   scanf("%d",&max_ele);
   for( int i= 0;i<max_ele;i++)
   {
     scanf("%d", &list[i]);
   }
   l_elem(list,max_ele);
   return 0;  
}
void l_elem(int list[],int max_ele)
{
     int i,large ,max_idx;
     large = list[0];
     max_idx = 0 ;
     for( i = 1; i < max_ele ; i++)
   { 
       if(large < list [i])
       {
           max_idx = i; 
       } 
   }  
   printf("%d",max_idx);
 }
