import java.util.Scanner;
class Exercise5
{
public static void main(String args[])
{
int num;
Scanner sc = new Scanner(System.in);
num=sc.nextInt();
System.out.println("Table of 8");
for(int i=1;i<10;i++)
{
System.out.println(num+" x "+(i+1)+ " = "+(num * (i+1)));
}
}
}