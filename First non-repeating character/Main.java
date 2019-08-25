#include<stdio.h>
#include<string.h>
int main()
{
	//Try out your code here
    char s[100];
    int count[150],i;
    scanf("%[^\n]s",s);
    for(i = 0 ; i < 150 ; i++)
      count[i] = 0;
  
    for(i = 0 ; i < strlen(s) ; i++){
        count[s[i]]++;
    } 
  
    for(i = 0; i < strlen(s) ; i++){
        if(count[s[i]] == 1){
           printf("%c",s[i]);
          break;
        }
    }  
  
    if(i == strlen(s))
      printf("All the characters are repetitive");
	return 0;
}