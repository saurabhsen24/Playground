#include<stdio.h>
int main()
{
  //Type your code here
  int mat[100][100],r,c,i,j;
  scanf("%d%d",&r,&c);
  
  for(i = 0 ; i < r ; i++){
    for(j = 0 ; j < c ; j++){
        scanf("%d",&mat[i][j]);
    }
  }
  
  for(i = 0 ; i < c ; i++){
     for(j = 0 ; j < r ; j++){
        printf("%d ",mat[j][i]);
     }
    printf("\n");
  }
  
  return 0;
}