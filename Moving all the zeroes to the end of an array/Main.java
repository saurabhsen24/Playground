#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,a[50],b[50] = {0},j = 0;
  scanf("%d",&n);
  for(i = 0; i < n; i++){
     scanf("%d",&a[i]);
    if(a[i] > 0){
      b[j++] = a[i];
    }
  }
  
    for(i = 0; i < n; i++){
       printf("%d ",b[i]);
    }
  return 0;
}