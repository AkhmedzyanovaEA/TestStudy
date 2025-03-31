package HW3_4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        if (phoneBook.containsKey(surname)) {
            phoneBook.get(surname).add(phoneNumber);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phoneBook.put(surname, numbers);
        }
    }


    public ArrayList<String> getNumber(String surname) {
        return phoneBook.get(surname);

    }

}
