#include<stdio.h>
int main()
{
	//Try out your code here
    char s[100],temp[100];
    int i,j;
    scanf("%[^\n]s",s);
    for(i = 0 ; s[i] != '\0' ; i++){
       if(s[i] == 'T'||'t' && s[i+1] == 'h' && s[i+2] == 'e'){
         i = i+3;
       }else{
         temp[j++] = s[i];
       }
    }
  
  temp[j] = '\0';
  printf("%s",temp);
	return 0;
}