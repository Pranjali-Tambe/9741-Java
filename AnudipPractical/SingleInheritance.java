class Test2
{
protected int a=10;
protected void msg()
{
System.out.println("Hello World");
}
}
class SingleInheritance extends Test2
{
public static void main(String args[])
{
SingleInheritance obj= new SingleInheritance();
System.out.println(obj.a);
obj.msg();
}
}
