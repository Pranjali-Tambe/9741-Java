import java.util.Scanner;
class Exercise4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first num");
int num1=sc.nextInt();
System.out.println("Enter second num");
int num2=sc.nextInt();
System.out.println(num1+" + "+num2+ " = " +(num1+num2));
System.out.println(num1+" - "+num2+ " = "  +(num1-num2));
System.out.println(num1+" * "+num2+ " = "  +(num1*num2));
System.out.println(num1+" / "+num2+ " = "  +(num1/num2));
System.out.println(num1+" % "+num2+ " = " +(num1%num2));
}
}