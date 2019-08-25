#include <stdio.h>
int main() {
	//Type your code here
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  printf("%d",gcd_of_three(n1,n2,n3));
	return 0;
}

int gcd_of_three(int x,int y,int z){
    int i,res;
  for(i = ((x < y)? x : y); ; i--){
      if(x%i == 0 && y%i == 0){
           break;
      }
  }
  
  res = i;
  for(i = ((res < z)? res : z); ; i--){
     if(res%i == 0 && z%i == 0){
         break;
     }
  }
  
  return i;
  
}