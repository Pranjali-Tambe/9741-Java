class ArrayEx4
{
public static void main(String args[])
{
int num[]=new int[]{20,35,-40,54,-60};
int sum=0;
for(int i=0;i<num.length;i++)
sum=sum+num[i];
double avg=sum/num.length;
System.out.println("Average of array :"+avg);
}
}