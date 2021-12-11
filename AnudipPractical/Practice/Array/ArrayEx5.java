public class ArrayEx5
{
public static boolean contains(int[] arr, int item)
{
for(int n : arr) 
{
if(item == n)
{
return true;
}
}
return false;
}
public static void main(String[] args)
{
int a[]= {2035,1899,2013,1458,2365,1456};
System.out.println(contains(a, 2019));
System.out.println(contains(a, 1458));
}
}