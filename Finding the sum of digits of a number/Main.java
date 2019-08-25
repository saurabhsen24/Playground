#include <stdio.h>
int main() {
	//Type your code
    int n,digit = 0,sum = 0;
    scanf("%d",&n);
    while(n != 0){
      digit = n%10;
      sum += digit;
      n /= 10;
    }
    
    printf("%d",sum);
	return 0;
}