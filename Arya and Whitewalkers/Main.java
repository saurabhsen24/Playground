#include <stdio.h>
int main() {
	//write your code here
   int n,stabs = 0;
   scanf("%d",&n);
  
  while(n != 0){
     if(n % 2 != 0){
        stabs++;
     }
    n /= 2;
  }
  
  printf("%d",stabs);
	return 0;
}