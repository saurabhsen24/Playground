#include<stdio.h>
#include<string.h>
int main()
{
	//Your Code here!!
  char str[100];
  int i,j,key;
  scanf("%[^\n]s",str);
  scanf("%d",&key);
  
  key = key%26;
  
  for(i = 0 ; i < strlen(str) ; i++){
     if(str[i] >= 'A' && str[i] <= 'Z'){
          int offset = str[i] - 'A';
          if(offset >= key){
             offset = offset - key;
          }else{
             offset = ('Z' - 'A') - (key - offset) + 1 ;
          }
          offset = offset + 'A';
          str[i] = (char)offset;
     }else if(str[i] >= 'a' && str[i] <= 'z'){
          int offset = str[i] - 'a';
          if(offset >= key){
             offset = offset - key;
          }else{
             offset = ('z' - 'a') - (key - offset) + 1;
          }
          offset = offset + 'a';
          str[i] = (char)offset;     
     }
  }
  
  printf("%s",str);
  return 0;
}