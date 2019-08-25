#include <stdio.h>
int main() 
{
	//write your code here
  int m,n,i;
  int a[20],b[20];
  scanf("%d%d",&m,&n);
  
  for(i = 0 ; i < m ; i++){
      scanf("%d",&a[i]);
  } 
  
  for(i = 0 ; i < n ; i++){
     scanf("%d",&b[i]);
  }

  merge(a,b,m,n);
  return 0;
}

void merge(int a[],int b[],int m,int n){
  int i,j,k;
  int c[m+n];
  i = 0; j = 0; k = 0;
  while(i < m && j < n){
     if(a[i] < b[j]){
       c[k++] = a[i++];
     }else{
       c[k++] = b[j++];
     }
  }
  
  while(i < m){
    c[k++] = a[i++];
  }
  
  while(j < n){
    c[k++] = b[j++];
  }
  
  for(k = 0 ; k < m+n ; k++){
      printf("%d ",c[k]);
  }  
}