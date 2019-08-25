#include<stdio.h>
int isPrime(int n);
int main(){
    // Type your code here
  int n,flag = 1,i;
  scanf("%d",&n);
  for(i = 2; i <= n ; i++){
    flag = isPrime(i);
    if(flag)
     printf("%d\n",i);
  }
    return 0;
}

int isPrime(int n){
int i,c = 0;
  for(i = 2; i <= n ;i++){
      if(n%i == 0){
         c++;
        if(c > 1)
          return 0;
      }
  }
  
  return 1;
}