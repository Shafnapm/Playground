#include<stdio.h>
int main()
{
 int y;
  scanf("%d", &y);
  if(y%4==0 && (y%400 || y%100!=0))
  {
    printf("Leap year");
  }
  else
  {
    printf("Not Leap year");
  }
  return 0;
}