import java.util.ArrayList;
import java.util.Collection;
public class emptyarray{
public static void main(String args[])
{
ArrayList<String> array=new ArrayList<String>();
array.add("usd");
array.add("uia");
array.add("ioeds");
array.add("wsia");
array.add("kia");
System.out.println("original array :" +array);
array.removeAll(array);
System.out.println("after remove all array" +array);
}}
