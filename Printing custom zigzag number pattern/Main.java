#include <stdio.h>
int main()
{
   // Try out your code here
  int n,i,j,flag = 1,m = 1;
  scanf("%d",&n);
  for(i = 0; i < n; i++){
    for( j = 0; j < n ;j++){
       if(flag){
          if(j != n-1){
             printf("%d",m);
          }else{
             printf("%d",m+1);
          }
       }else{
         if(j == 0){
            printf("%d",m+1);
         }else{
           printf("%d",m);
         }
       }
    }
    flag = 1 - flag;
    m++;
    printf("\n");
  }
   return 0;
}