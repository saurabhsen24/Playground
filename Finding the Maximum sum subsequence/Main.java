#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,j,start_idx = 0,sum = 0,max_sum = 0;
  scanf("%d",&n);
  int a[n],seq[2*n];
  for(i = 0 ; i < n ; i++)
    scanf("%d",&a[i]);
  
  for(i = 0 ; i < n-1 ; i++){
     if(a[i] > a[i+1]){
        seq[j++] = start_idx;
        seq[j++] = i;
        start_idx = i+1;
     }
  }
  
  if(start_idx != n-1){
     seq[j++] = start_idx;
     seq[j++] = n-1;
  }
  
  if(start_idx == n-1){
     seq[j++] = start_idx;
    seq[j++] = n-1;
  }
  //printf("%d\n",j);
  for(i = 0 ; i < j ; i += 2){
    start_idx = seq[i];
    int end_idx = seq[i+1];
    sum = 0;
    for(int k = start_idx ; k <= end_idx ; k++){
       sum += a[k];
    }
    
    if(max_sum < sum){
       max_sum = sum;
    }
  }
  
  printf("%d",max_sum);
  return 0;
}