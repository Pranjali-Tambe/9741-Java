class EncapDemo{
private int i;
private String empName;
private int empAge;
public int geti()
{
return i;
}
public String getempName()
{
return empName;
}
public int getempAge()
{
return empAge;
}

public void seti(int xyz){
i=xyz;
}
public void setempName(String xyz)
{
empName=xyz;
}
public void setempAge(int xyz)
{
empAge=xyz;
}
}
class EncapsulationDemo2
{
public static void main(String args[]){
EncapDemo obj= new EncapDemo();
obj.seti(234);
System.out.println("i value" +obj.geti());
obj.setempName("pranjali");
System.out.println("empName" +obj.getempName());

} 
}