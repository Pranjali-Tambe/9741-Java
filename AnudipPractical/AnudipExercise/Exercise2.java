import java.util.Scanner;
class Exercise2
{

public static void main(String args[])
{
int i,num;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
for(i=1;i<=num;i++)
{
System.out.println("cube of " + num + " is " + num*num*num);

}

}}