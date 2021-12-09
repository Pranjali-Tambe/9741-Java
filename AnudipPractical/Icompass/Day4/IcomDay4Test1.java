public class IcomDay4Test1
{
static void methodA(short s)
{
System.out.println("methodA(short)called");
}
static void methodA(int i)
{
System.out.println("methodA(int)called");
}
static void methodB(float f)
{
System.out.println("methodA(float)called");
}
static void methodB(double d)
{
System.out.println("methodA(double)called");
}
public static void main(String args[])
{
methodA(5);
methodB(5.2);
}
}