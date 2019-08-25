#include<stdio.h>
int main()
{
  //Type your code here
  int m,n,key,i,j,flag;
  int a[10][10];
  scanf("%d%d",&m,&n);
  for(i = 0 ; i < m ; i++){
     for(j = 0 ; j < n ; j++){
        scanf("%d",&a[i][j]);
     }
  }
  
  scanf("%d",&key);
  flag = 0;
  for(i = 0 ; i < m ; i++){
     for(j = 0 ; j < n ; j++){
        if(a[i][j] == key){
           printf("(%d, %d)",i,j);
           flag = 1;
          break;
        }
     }
  }
  
  if(!flag){
     printf("(%d, %d)",-1,-1);
  }
  
  return 0;
}