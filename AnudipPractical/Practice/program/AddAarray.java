import java.util.ArrayList;
import java.util.*;

public class AddAarray
{
public static void main(String args[])
{
ArrayList<String> L1 = new ArrayList<>(Arrays.asList("jh","q","sdf"));
ArrayList<String> L2 = new ArrayList<>(Arrays.asList("jsh","d","kdf"));
L1.addAll(L2);
System.out.println(L1);
}
}