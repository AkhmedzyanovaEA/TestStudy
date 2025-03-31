package HW3_4;

import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) {
        String[] words = {"яблоко", "груша", "банан", "апельсин", "апельсин", "банан", "лимон", "апельсин", "яблоко", "киви"};

        HashMap<String, Integer> countWord = new HashMap<>();

        for (String word : words) {
            countWord.put(word, countWord.getOrDefault(word, 0) + 1);
        }

        System.out.println("Список уникальных слов и количество:");
        for (String word : countWord.keySet()) {
            System.out.println(word + ": " + countWord.get(word));
        }

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "89112223344");
        phoneBook.add("Петров", "89112223355");
        phoneBook.add("Сидоров", "89112223366");
        phoneBook.add("Кузнецов", "89112223377");
        phoneBook.add("Петров", "89112223388");

        String surname = "Петров";

        System.out.println("Номера абонента " + surname);
        for (String phoneNumber : phoneBook.getNumber(surname)) {
            System.out.println(phoneNumber);

        }
    }
}

