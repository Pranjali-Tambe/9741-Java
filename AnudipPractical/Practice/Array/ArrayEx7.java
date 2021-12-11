import java.util.Arrays; 
public class ArrayEx7
{
public static void main(String[] args)
{
int arr[] = {47, 84, 55, 42, 77, 65, 25, 98, 25 };
System.out.println("Original Array : "+Arrays.toString(arr));     
int removeIndex = 1;
for(int i = removeIndex; i < arr.length -1; i++)
{
arr[i] = arr[i + 1];
} 
System.out.println("After removing the element: "+Arrays.toString(arr));
}
}