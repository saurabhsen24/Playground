#include<stdio.h>
int main()
{
  //Type your code here
  int  n,k,c[50] = {0},i;
  scanf("%d",&n);
  int a[n];
  scanf("%d",&k);
  for(i = 0 ; i < n ; i++){
     scanf("%d",&a[i]);
  }
  
  for(i = 0 ; i < n ; i++){
     c[a[i]]++;
  }
  
  for(i = 1; i <= k ; i++){
     printf("%d %d\n",i,c[i]);
  }
  return 0;
}