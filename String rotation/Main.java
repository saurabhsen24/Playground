#include<stdio.h>
#include<string.h>
int main()
{
  char st1[20], st2[20],temp[20];
  //Type your code here
  int i,j,rot = 0,len;
  gets(st1);
  gets(st2);
  len = strlen(st2);
  while(1){
  for(i = 0; i < strlen(st2) ; i++){
     temp[(i+rot)%strlen(st2)] = st2[i];
  }
    if(strcmp(st1,temp) == 0){
      printf("Yes");
      exit(0);
    }
    
    if(rot == len){
       printf("No");
      exit(0);
    }
    rot++;
  }
  return 0;
}