#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str[20],rev[20];
  int l,i,j;
  scanf("%s",str);
  l = strlen(str);
  strcpy(rev,str);
  for(i = 0,j = l-1 ; i < l/2 ; i++,j--){
       char temp;
      temp = str[i];
      str[i] = str[j];
      str[j] = temp;
  }
  
  if(strcmp(str,rev) == 0){
     printf("%s is a palindrome",str);
  }else{
     printf("%s is not a palindrome",rev);
  }
  return 0;
}