#include <stdio.h>
int main() {
	//Type your code
    int n,digit;
  scanf("%d",&n);
  while(n != 0){
    digit = n%10;
    n = n/10;
    if(n >=1 && n<=9)
      break;
  }
  
  printf("%d",digit);
	return 0;
}