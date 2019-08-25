#include <stdio.h>
int main() 
{
    //write your logic here
  int a[20],c[20];  
  int n,i;
  scanf("%d",&n);
  
  for(i = 0 ; i < n ; i++){
     scanf("%d",&a[i]);
  }
  
  for(i = 0 ; i < 20 ; i++)
     c[i] = 0;
  
  for(i = 0 ; i < n ; i++){
     c[a[i]]++;
  }
  
  for(i = 0 ; i < 20 ; i++){
     if(c[i] != 0)
       printf("%d ",i);
  }
  
	return 0;
}