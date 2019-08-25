#include <stdio.h>
int main(){
  	// Type your code here
  int i,j,n;
  scanf("%d",&n);
  for(i = 1; i <= n; i++){
    for(j = 1; j <= i ; j++){
      printf("%d",i);
    }
    printf("\n");
  }
	return 0;
}