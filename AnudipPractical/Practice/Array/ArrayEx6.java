class ArrayEx6
{
public static int findindex (int arr[],int t) {
if (arr== null) return -1;
int len = arr.length;
int i = 0;
while (i < len) 
{
if (arr[i]==t) return i;
else i=i+1;
}
return -1;
}
public static void main(String[] args) 
{
int arr[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
System.out.println("Index position of 25 is: " + findindex(arr, 25));
System.out.println("Index position of 77 is: " + findindex(arr, 77));
}
}