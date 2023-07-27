import java.util.Dictionary;
import java.util.Hashtable;

public class Dictionary1 {
    public static void main(String[] args) {
        Dictionary dict=new Hashtable();
        dict.put(100,"ram");
        dict.put(101,"Aajinath");
        dict.put(102,"Parmeshwar");
        dict.put(103,"Om");
        dict.put(104, "Vaibhav");
        System.out.println("the value of specified key is "+dict.get(102));

    }
}
