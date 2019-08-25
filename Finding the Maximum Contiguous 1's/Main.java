#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,j,count = 0,start_idx = 0,max_count = 0;
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
     seq[j++] = n-1 ;
  }
  
  if(start_idx == n-1){
     seq[j++] = start_idx;
     seq[j++] = n-1;
  }

  for(i = 0 ; i < j ; i += 2){
     count = 0;
     start_idx = i;
     int end_idx = i+1;
     count = 0; 
    for(int k = seq[start_idx] ; k <= seq[end_idx] ; k++){
       if(a[k] == 1)
         count++;
    }
    
    if(max_count < count){
       max_count = count;
    }
  }
  
  printf("%d",max_count);
  return 0;
}