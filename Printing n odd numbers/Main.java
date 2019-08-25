#include <stdio.h>
int main() {
	//Type your code
  int n,i,num = 0;
  scanf("%d",&n);
  for(i = 0; ; ){
     num++;
     if(num%2 == 1){
       printf("%d\n",num);
       i++;
       if(i == n){
          break;
       }
     }
  } 
	return 0;
}