import java.util.Arrays; 
public class ArrayEx8
{
public static void main(String[] args) 
{
int arr[]= {14, 25, 44, 36, 17, 85, 33, 18, 29, 49};
int array[] = new int[10];     
System.out.println("Source Array : "+Arrays.toString(arr));     
for(int i=0; i < arr.length; i++)
{
array[i] = arr[i];
}
System.out.println("New Array: "+Arrays.toString(array));
}
}