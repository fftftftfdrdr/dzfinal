package lesson5;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class phonebook {
    static Map<String, ArrayList<String>> phonebook = new HashMap<>();
    
    public static void main(String[] args) {    
        data();
        PrintPhonebook(phonebook);
        PrintPhonebookABC(phonebook);
    }
    private static void PrintPhonebook(Map<String, ArrayList<String>> map) {
        System.out.println("тел книга в обычном порядке");
        map.entrySet().forEach(System.out::println);
        System.out.println();
    }
    private static void PrintPhonebookABC(Map<String, ArrayList<String>> map) {
        System.out.println("отсортированная книга по алфавиту");
        map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(System.out::println);
        System.out.println();
    }
    private static void data() {
        phonebook.put("Иванов", new ArrayList<>());
        phonebook.get("Иванов").add("121212");
        phonebook.get("Иванов").add("232323");
        phonebook.put("Томко", new ArrayList<>());
        phonebook.get("Томко").add("343434");
        phonebook.put("Пушкин", new ArrayList<>());
        phonebook.get("Пушкин").add("565656");
        phonebook.get("Пушкин").add("676767");
        phonebook.put("Сидоров", new ArrayList<>());
        phonebook.get("Сидоров").add("787878");
        phonebook.put("Геркулес", new ArrayList<>());
        phonebook.get("Геркулес").add("898989");
    }
}