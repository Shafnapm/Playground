#include<stdio.h>
int main()
{
  char str[50];
 int i,j,pal,len;
  pal=0;
  scanf("%s",str);
  len=strlen(str);
  for(i=0;i<=len;i++)
  {
    if(str[i]!=str[len-i-1])
    {
      pal=1;
      break;
    }
  }
  if(pal)
  {
    printf("%s is not a palindrome",str);
  }
  else
  {
    printf("%s is a palindrome",str);
  }
  return 0;
}