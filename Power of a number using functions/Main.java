#include<stdio.h>
int main(){
    // Type your code here
  int base,exp;
  scanf("%d%d",&base,&exp);
  printf("%d",power(base,exp));
  	return 0;
}

int power(int base,int exp){
   int res = 1,i;
   for(i = 1; i <= exp ;i++){
       res *= base;
   }
  return res;
}