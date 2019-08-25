#include <stdio.h>
int main() 
{
    //write your code here
    int n,i,max,j = 0;
    int a[10],b[10];
    scanf("%d",&n);
    for(i = 0 ; i < n ; i++){
       scanf("%d",&a[i]);
    }
  
    b[0] = a[n-1];
    for(i = n - 2 ; i >= 0 ; i--){
       if(max < a[i]){
          max = a[i];
          b[++j] = max;
       }
    }
  
    for(i = j ; i >= 0 ; i--){
       printf("%d ",b[i]);
    }
    return 0;
}