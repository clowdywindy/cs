#include<stdio.h>>
int add2(int x,int y)
{
 int n1=x;
int n2=y;
int n3=n1+n2;
return n3;
}
int main()
{
int a=15,b=5,c=0;
c=add2(a,b);
printf("The sum is %d\n",c);
}
