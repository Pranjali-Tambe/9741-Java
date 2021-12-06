class Inheritance
{
String collage="GVA";
String depart="COMCS";
}
public class InheritanceStudent extends Inheritance
{
String sub="maths";
public static void main(String args[])
{
InheritanceStudent stu= new InheritanceStudent();
System.out.println(stu.collage);
System.out.println(stu.depart);
System.out.println(stu.sub);
}
}