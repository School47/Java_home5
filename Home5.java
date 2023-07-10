import java.util.*;

public class Home5 {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        // Добавление номеров телефонов в телефонную книгу
        addToPhoneBook(phoneBook, "Джонни Депп", "1234567890");
        addToPhoneBook(phoneBook, "Джонни Депп", "9876543210");
        addToPhoneBook(phoneBook, "Уилл Смит", "5551234567");
        addToPhoneBook(phoneBook, "Николас Кейдж", "1112223333");
        addToPhoneBook(phoneBook, "Николас Кейдж", "9998887777");

        // Cортировка по количеству телефонов
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
        
        //Вывод резульатов 
        for (Map.Entry<String, List<String>> entry : entries) {
            String name = entry.getKey();
            List<String> phones = entry.getValue();
            System.out.println(name + ": " + phones);
        }
    }

    // Метод для добавления номера телефона в телефонную книгу
    public static void addToPhoneBook(HashMap<String, List<String>> phoneBook, String name, String phone) {
        if (phoneBook.containsKey(name)) {
            List<String> phones = phoneBook.get(name);
            phones.add(phone);
            phoneBook.put(name, phones);
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            phoneBook.put(name, phones);
        }
    }
}