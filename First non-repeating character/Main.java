#include<stdio.h>
int main()
{
	char str[100];
  char ch;
  scanf("%[^\n]s",str);
  int count;
  for(int i=0;str[i]!='\0';i++)
  {
    count=0;
    for(int j=0;str[j]!='\0';j++)
    {
      
     if(str[i]==str[j] && i!=j)
     {
       count=1;
       break;
     }
    }

    if(count==0)
    {
        ch=str[i];
      break;
    }
  }
    if(count==0)
    {
      printf("%c",ch);
    }
    else
    {
      printf("All the characters are repetitive");

  }
}