#include <stdio.h>
int main() {
	//Type your code
  int n,digit,f = 1,t,i,sum = 0;
  scanf("%d",&n);
  t = n;
  while(n > 0){
    digit = n%10;
    for(i = 1; i<= digit ; i++){
      f *= i;
    }
    
    sum += f;
    f = 1;
    n /= 10;
  }

  if(t == sum){
    printf("Yes");
  }else{
    printf("No");
  }
	return 0;
}