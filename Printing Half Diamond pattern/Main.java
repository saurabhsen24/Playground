#include <stdio.h>
int main() {
	// Type your code here
  int n,i,j,mid;
  scanf("%d",&n);
  mid = (2*n-1)/2;
  for(i = 0; i < n ; i++){
     for(j = 0; j < 2*n-1 ; j++){
        if(j >= mid-i && j <= mid+i){
           printf("*");
        }else{
          printf(" ");
        }
     }
    printf("\n");
  }
	return 0;
}