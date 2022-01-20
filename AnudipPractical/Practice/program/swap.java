import java.util.*;
public class swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a two number");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("before swapping number:"+a+""+b);
int temp=a;
a=b;
b=temp;
System.out.println("after swapping number:"+a+""+b);
System.out.println();
}
}