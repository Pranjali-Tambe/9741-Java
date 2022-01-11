import java.util.*;
class TryCatchEx{
public static void main(String args[]){
try{
int n1,n2;
System.out.println("Enter two numbers=");
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
n2=sc.nextInt();
int result=n1/n2;
System.out.println("Division = "+result);
}
catch(NullPointerException e){
System.out.println("First Catch block");
}
catch(Exception e){
System.out.println("second catch block");
}
finally{
System.out.println("Program successfully executed-this is the final block");
}
}
}