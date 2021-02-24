package Homework10;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    Map<String, Integer> baseOfPhoneNumbers = new HashMap<>();

    public  void add(String name, int phoneNumber){
        baseOfPhoneNumbers.put(name,phoneNumber);
    }

    public void get(String name){
        System.out.println(baseOfPhoneNumbers.get(name)) ;
    }

}
