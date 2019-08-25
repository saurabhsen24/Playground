#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char text[100],str[10][20],word[20],rpword[20];
  int i = 0,j,k = 0,len = 0;
  gets(text);
  gets(word);
  gets(rpword);
  for(j = 0 ; text[j] != '\0' ; j++){
     if(text[j] != ' '){
        str[i][k++] = text[j];
     }else{
        i++;
       k = 0;
     }
  }
  len = i;
  //printf("%d",len);
  for(i = 0; i <= len ; i++){
     if(strcmp(str[i],word) == 0)
       strcpy(str[i],rpword);
    printf("%s ",str[i]);
  }
  return 0;
}