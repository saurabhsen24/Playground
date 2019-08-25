#include<stdio.h>

int sumOfNaturalNumbers(int n);;
int main() {
    // Type your code here
   int n;
  scanf("%d",&n);
  printf("%d",sumOfNaturalNumbers(n));
  	return 0;
}

int sumOfNaturalNumbers(int n){
   int i,sum = 0;
  for(i = 1; i <= n;i++)
    sum += i;
  return sum;
}