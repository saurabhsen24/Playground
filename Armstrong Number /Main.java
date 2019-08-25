#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int num,i,digit,sum,temp,count = 0;
  scanf("%d",&num);
  temp = num;
  while(num > 0){
     count++;
    num /= 10;
  }
  
  num = temp;
  
  while(num > 0){
     digit = num%10;
     sum += pow(digit,count);
    num = num/10;
  }
  
  if(sum == temp){
    printf("Armstrong Number");
  }else{
    printf("Not an Armstrong Number");
  }
	return 0;
}