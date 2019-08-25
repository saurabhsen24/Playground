#include<stdio.h>
int main()
{
  //Type your code here
  int n,a[10],i,j = 1,flag = 0,not_present = 0;
  scanf("%d",&n);
  for(i = 0 ; i < n ; i++)
    scanf("%d",&a[i]);
  for(i = 0 ; i < n ; i++){
     if(a[i] == j){
        j++;
     }
  }
  
  printf("%d",j);
  return 0;
}