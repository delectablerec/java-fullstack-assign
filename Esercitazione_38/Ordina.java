import java.util.ArrayList;
import java.util.Collections;

public class Ordina {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Strawberry");

        // Shuffle the list
        Collections.shuffle(list);

        // Print the shuffled list
        System.out.println("Shuffled list: " + list);
    }
}