#include<stdio.h>
int main()
{
  //Type your code here
     int a[10];
     int n,i,j,key;
     scanf("%d",&n);
     for(i = 0 ; i < n ; i++){
         scanf("%d",&a[i]);
     }
     
     for(i = 1 ; i < n ; i++){
         j = i - 1;
         key = a[i];
         while(j >= 0 && a[j] > key){
            a[j+1] = a[j];
            j--;
         }
         a[j+1] = key;
     }
  
     for(i = 0 ; i < n ; i++){
        printf("%d\n",a[i]);
     }
  return 0;
}