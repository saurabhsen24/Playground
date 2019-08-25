#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char s1[50],s2[50];
  int i,j,count = 0;
  gets(s1);
  gets(s2);
  for(i = 0; i < strlen(s1) ; i++){
     if(s1[i] >= 'A' && s1[i] <= 'Z'){
        s1[i] = s1[i] + 32;
     }
  }
  
 for(i = 0; i < strlen(s2) ; i++){
     if(s2[i] >= 'A' && s2[i] <= 'Z'){
        s2[i] = s2[i] + 32;
     }
  }
  
  for(i = 0 ; i < strlen(s1)-strlen(s2)+1 ; i++){
    int is_match = 1;
     for(j = 0 ; j < strlen(s2) ; j++){
          if(s1[i+j] != s2[j]){
             is_match = 0;
          }
     }
    
    if(is_match == 1){
         count++;
    }
  }
  
  printf("%d",count);
  return 0;
}