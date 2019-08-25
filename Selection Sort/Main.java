#include<stdio.h>
int main()
{
  //Type your code here
  int n,temp,i,j,min;
  int a[10];
  scanf("%d",&n);
  for(i = 0 ; i < n ; i++){
     scanf("%d",&a[i]);
  }
  
  for(i = 0 ; i < n - 1 ; i++){
     min = i;
    for(j =  i + 1 ; j < n ; j++){
      if(a[min] > a[j]){
         min = j;
      }
    }
    
    temp = a[min];
    a[min] = a[i];
    a[i] = temp;
  }
  
  for(i = 0 ; i < n ; i++){
     printf("%d\n",a[i]);
  }
  return 0;
}