#include<stdio.h>
int main()
{
  int n,i,ele,pos = -1;
  int a[10];
  scanf("%d",&n);
  
  for(i = 0; i < n ; i++){
     scanf("%d",&a[i]);
  }
  
  scanf("%d",&ele);
  
  for(i = 0 ; i < n ; i++){
    if(ele < a[i]){
       pos =  i - 1;
       break;
    }
    
    pos = n;
  }
  

  for(i = n ; i >= pos ; i--){
      a[i] = a[i-1];
  }
 
  a[pos] = ele;
  
  for(i = 0 ; i < n + 1; i++){
     printf("%d ",a[i]);
  }
  return 0;
}