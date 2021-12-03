import java.util.Scanner;
class Exercise8
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("first integer");
int num1=sc.nextInt();
System.out.println("second integer");
int num2=sc.nextInt();
if(num1 != num2)
System.out.println(num1+ "!=" +num2);
if(num1 < num2)
System.out.println(num1+ "<" +num2);
if(num1 <= num2)
System.out.println(num1+ "<=" +num2);
}
}