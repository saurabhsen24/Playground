#include <stdio.h>
int main() {
	// Type your code here
  int n,i,j,c = 1,mid,flag = 1;
  scanf("%d",&n);
  mid = (2*n-1)/2;
  for(i = 0 ; i < n; i++){
    flag = 1;
     for(j = 0; j < 2*n-1 ;j++){
        if(j >= mid-i && j <= mid+i){
          if(flag){
             printf("%d",c);
            c++;
          }else{
             printf(" ");
          }
          flag = 1 - flag;
        }else{
           printf(" ");
        }
     }
    printf("\n");
  }
	return 0;
}