#include<stdio.h>
int main()
{
	//Try out your code here
   int a[10][10],r,c,i,j;
   scanf("%d%d",&r,&c);
   for(i = 0 ; i < r ; i++){
      for(j = 0 ; j < c ; j++){
         scanf("%d",&a[i][j]);
      }
   } 
  
   for(j = c-1 ; j >= 0 ; j--){
     for(i = 0 ; i < r ; i++){
         printf("%d ",a[i][j]);
     }
     printf("\n");
   }
	return 0;
}