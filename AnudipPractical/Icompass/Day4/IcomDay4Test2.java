class A
{
final void m1()
{
System.out.println("m1 called");
}
}
class B extends A
{
public void m2()
{
m1();
System.out.println("m2 called");
}
}

public class IcomDay4Test2
{
public static void main(String args[])
{
B b=new B();
b.m1();
b.m2();
}
}