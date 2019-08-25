#include<stdio.h>
#include<string.h>
int main() {
    //write your code here
    int n,i,j;
    int stack[20];
    int top = -1,data;
    char s[50];
    scanf("%d",&n);
   
  for(i = 0 ; i < n ; i++){
    scanf("%s",s);
    if(strcmp(s,"push") == 0){
      if(top == n)
         return -1;
       //printf("push\n");
       scanf("%d",&data);
       stack[++top] = data;
    }else if(strcmp(s,"pop") == 0){
       if(top == -1)
         return -1;
      //printf("pop\n");
       printf("%d\n",stack[top--]);
    }else if(strcmp(s,"print") == 0){
      for(j = 0 ; j <= top ; j++)
      printf("%d ",stack[j]);
      
      printf("\n");
    }
  }
    return 0;
}