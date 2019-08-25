#include <stdio.h>
int greatest_of_three(int x,int y,int z);
int main(){
	// Type your code here
  int n1,n2,n3;
  scanf("%d",&n1);
  scanf("%d",&n2);
  scanf("%d",&n3);
  printf("%d",greatest_of_three(n1,n2,n3));
  	return 0;
}

int greatest_of_three(int x,int y,int z){
  return  ((x > y)?((x > z)? x : z):((y > z)? y : z));
}