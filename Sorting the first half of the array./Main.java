#include<stdio.h>
int main()
{
	//Try out your code here
  int n,i,j,key = 0;
  scanf("%d",&n);
  int a[n];
  for(i = 0 ; i < n ; i++)
    scanf("%d",&a[i]);
  for(i = 1 ; i < n/2 ; i++){
     key = a[i];
    j = i - 1;
    while((j >= 0) && (a[j] > key)){
        a[j+1] = a[j];
        j--;
    }
    a[j+1] = key;
  }
  
  for(i = 0 ; i < n ; i++)
    printf("%d ",a[i]);
	return 0;
}