#include<stdio.h>
int main()
{
  //Type your code here
  int n,first,second;
  scanf("%d",&n);
  first = n/10;
  second = n%10;
  printf("%d",first+second);
  return 0;
}