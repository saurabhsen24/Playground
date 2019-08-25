#include<stdio.h>
int main()
{
//Type your code here
  int n,i,j,k;
  scanf("%d",&n);
  int a[n];
  for(i = 0 ; i < n ; i++)
    scanf("%d",&a[i]);
  
  scanf("%d",&k);
  for(i = 0 ; i < n ; i++){
    for(j = 0 ; j < n-i-1; j++){
       if(a[j] < a[j+1]){
         int temp = a[j+1];
         a[j+1] = a[j];
         a[j] = temp;
       }
    }
  }

  printf("%d",a[k-1]);
return 0;
}