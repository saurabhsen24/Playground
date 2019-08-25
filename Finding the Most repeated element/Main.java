#include<stdio.h>
int main()
{
  int n,i,index = 0,max = 0,a[50] = {0},count[50] = {0},flag = 1;
  scanf("%d",&n);
  for(i = 0 ; i < n ; i++)
    scanf("%d",&a[i]);
  
  for(i = 0 ; i < n ; i++){
    count[a[i]]++;
  }
  
  for(i = 0 ; i < n-1 ; i++){
     if(count[a[i]] == count[a[i+1]]){
        flag = 0;
     }else{
        flag = 1;
       break;
     }
  }
  
  if(!flag){
    printf("%d",a[0]);
    exit(0);
  }
  
  for(i = 0 ; i < 50 ; i++){
     if(max < count[i]){
       max = count[i];
       index = i;
     }
  }
  
  printf("%d",index);
  return 0;
}