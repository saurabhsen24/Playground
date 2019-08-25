#include<stdio.h>
int main()
{
  // Type your code here
  char s[50],temp,r[50];
  int i,j,k,len = 0;
  scanf("%[^\n]s",s);
  
  for(i = strlen(s)-1 ; i >= 0 ; i--){
     if(s[i] == ' '){
        s[i] = '\0';
        printf("%s ",&(s[i])+1);
     }
  }
  
  printf("%s",s);
  return 0;
}