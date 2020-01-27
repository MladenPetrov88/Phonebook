import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String[] command = scanner.nextLine().split("-");
       Map<String, String> phoneBook = new LinkedHashMap<>();

       while (!command[0].equals("search")) {
           String name = command[0];
           String number = command[1];

           if (!phoneBook.containsKey(name)) {
               phoneBook.put(name, number);
           } else {
               phoneBook.put(name, phoneBook.get(number));
           }

           command = scanner.nextLine().split("-");
       }

       String input = scanner.nextLine();

       while (!input.equals("stop")) {
           if (phoneBook.containsKey(input)) {
               System.out.println(input + " -> " + phoneBook.get(input));
               } else {
               System.out.println("Contact " + input + " does not exist.");
           }

           input = scanner.nextLine();
           }
       }

    }
