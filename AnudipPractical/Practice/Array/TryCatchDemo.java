import java.util.*;
public class TryCatchDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers=");
int a=sc.nextInt();
int b=sc.nextInt();
try{
System.out.println(a/b);
}
catch(Exception e){
System.out.println("Divide by zero cannot be possible");
}
}
}