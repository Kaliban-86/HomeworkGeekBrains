package Homework10;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    static List<String> names = new ArrayList<>();
    static List<Integer> phoneNumbers = new ArrayList<>();

    public void add(String name, int phoneNumber) {
        names.add(name);
        phoneNumbers.add(phoneNumber);
    }

    public void get(String name) {
        System.out.print(name.toLowerCase() + " - ");
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(name)) {
                System.out.print(phoneNumbers.get(i) + " # ");
            }
        }
        System.out.println();
    }
}
