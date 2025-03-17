// Java program to illustrate the use of ArrayList and Iterator
import java.util.*;

public class MyProgram {
    public static void main(String[] args) {
        // create an array list
        ArrayList<Integer> list = new ArrayList<>();
        
        // add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        // create an iterator
        Iterator<Integer> itr = list.iterator();
        
        // loop over the elements using next() method
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
