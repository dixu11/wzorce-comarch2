package behavioral;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jan");
        names.add("Marta");
        names.add("Anna");
        names.add("Roman");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.toUpperCase().startsWith("R")) {
                iterator.remove();
            }
        }
        System.out.println(names);
    }
}
