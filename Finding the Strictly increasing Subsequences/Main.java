#include<stdio.h>
int main()
{
	//Try out your code here
  int n,i,j,key,max;
  scanf("%d",&n);
  int a[n];
  for(i = 0 ; i < n ; i++)
    scanf("%d",&a[i]);
  
  for(i = 0; i < n-1 ; i++){
    max = 0;
     for(j = i+1 ; j < n ; j++){
         if(a[i] < a[j]){
              if(max < a[j]){
                max = a[j];
                printf("%d,%d\n",a[i],a[j]);
              }
         }
     }
  }
	return 0;
}