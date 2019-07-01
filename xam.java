import java.util.Scanner;
class xam
{
public static void main(String args[])
{
int a[],n,x;
a=newint[20];
scanner input=new scanner(system.in);
system.out.println("enter the size");
n=nextint();
for(int i=0;i<n;i++)
{ 
system.out.println("enter the number");
x=in.nextInt();
a[i]=x;
}
int sum=0;
for(int i=0;i<n;i++)
{
if((a[i]%2)==0)
{
sum=sum+i+1;
}
}
system.out.println("the sum of even positions is " +sum);
}
}	

	