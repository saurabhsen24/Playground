#include <stdio.h>
int main() {
	//Type your code
  int n,i,j = 1;
  scanf("%d",&n);
  for(i = 1; j <= n ; i++){
    if(i%4 == 0){
      printf(",");
    }else{
      printf("%d",j);
      j++;
    }
  }
	return 0;
}