#include<stdio.h>
#include<string.h>
int main()
{
  char str[100],rev[100];
  int beg,end,i,j,len;
  gets(str);
  scanf("%s",str);
  len=strlen(str);
  j=0;
  beg=len-1;end=len-1;
  while(beg>0)
  {
    if(str[beg]==' ')
    {
      i=beg+1;
      while(i<=end)
      {
        rev[j]=str[i];
        i++;
        j++;
      }
      rev[j++]=' ';
      end=beg-1;
    }
    beg--;
  }
  for(i=0;i<=end;i++)
  {
    rev[j]=str[i];
    j++;
  }
  rev[j]='\0';
  printf("%s",rev);
  return 0;
}