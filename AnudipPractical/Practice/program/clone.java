import java.util.ArrayList;
public class clone {
public static void main(String[] args)
{   
ArrayList<Integer> number = new ArrayList<>();
number.add(1);
number.add(3);
number.add(5);
System.out.println("ArrayList: " + number);
ArrayList<Integer> cloneNumber = (ArrayList<Integer>)number.clone();
System.out.println("Cloned ArrayList: " + cloneNumber);
}
}