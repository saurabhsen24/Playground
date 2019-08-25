#include <stdio.h>
int main() {
	//Type your code
    int n,first,last;
  scanf("%d",&n);
  last = n%10;
  while(n != 0){
    first = n%10;
    n = n/10;
  }
  
  printf("%d",first+last);
	return 0;
}