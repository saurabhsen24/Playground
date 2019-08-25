#include<stdio.h>
int fact(int n);
int main()
{
	//Try out your code here
  int n;
  scanf("%d",&n);
  printf("%d",fact(n));
	return 0;
}

int fact(int n){
  if(n == 1)
      return 1;
  return n*fact(n-1);
}