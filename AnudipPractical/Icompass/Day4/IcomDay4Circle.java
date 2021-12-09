class shape
{
public double calArea()
{
return 0;
}
}
public class IcomDay4Circle extends shape
{
int radius;
public IcomDay4Circle(int radius)
{
this.radius=radius;
} 
public double calArea()
{
return 3.142*radius*radius;
}
public static void main(String args[])
{
shape obj=new IcomDay4Circle(5);
System.out.println(obj.calArea());
}
}