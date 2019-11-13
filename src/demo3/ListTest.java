package demo3;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Jan");
        names.add("Wojciech");

        System.out.println(names.size());
        names.remove("Jan");

        System.out.println(names);
    }
}
