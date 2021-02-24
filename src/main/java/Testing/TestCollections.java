package Testing;

import Homework10.Phonebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TestCollections {
    public static void main(String[] args) {
        Phonebook phonebookOfRussia = new Phonebook();
        phonebookOfRussia.add("Иванов",891100000);
        phonebookOfRussia.add("Петров",892100000);
        phonebookOfRussia.add("Сидоров",891800000);
        phonebookOfRussia.add("Магомедов",891400000);
        phonebookOfRussia.add("Исаев",893100000);
        phonebookOfRussia.add("Селезнев",899900000);
        phonebookOfRussia.add("Селезнев",890400000);

       phonebookOfRussia.get("Петров");


    }
}
