package Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TestCollections {
    public static void main(String[] args) {
        Set<Integer> intSet = new TreeSet<>();
        intSet.add(4);
        intSet.add(2);
        intSet.add(0);
        intSet.add(4);
        intSet.add(0);
        intSet.add(5);

        System.out.println(intSet);

    }
}
