package PersonInformation;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Person> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	
            System.out.println("1. Add person");
            System.out.println("2. Print all persons");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int apokapo = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (apokapo) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter country name: ");
                    String countryName = scanner.nextLine();
                    System.out.print("Enter state: ");
                    String state = scanner.nextLine();
                    System.out.print("Enter city: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter postal code: ");
                    double postalCode = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline left-over

                    ContactDetails contact = new ContactDetails(phoneNumber, email);
                    Country country = new Country(countryName, state, city, postalCode);
                    Person person = new Person(name, age, contact, country);

                    map.put(name, person);
                    break;
                case 2:
                    for (Person person1 : map.values()) {
                        System.out.println(person1);
                    }
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
                    scanner.close();     }
           
        } }
}


	

