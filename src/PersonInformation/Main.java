package PersonInformation;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

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
                	// Prompt for name
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();

                    // Prompt for age with validation
                    int age = -1;
                    while (age < 0 || age > 120) {
                        System.out.print("Enter your age (0-120): ");
                        if (scanner.hasNextInt()) {
                            age = scanner.nextInt();
                            if (age < 0 || age > 120) {
                                System.out.println("Invalid age. Please enter a valid age.");
                            }
                        } else {
                            System.out.println("Invalid input. Please enter a number.");
                            scanner.next(); // Clear the invalid input
                        }
                    }
                    scanner.nextLine(); // Consume the leftover newline

                    // Prompt for email with validation
                    String email;
                    while (true) {
                        System.out.print("Enter your email: ");
                        email = scanner.nextLine();
                        if (isValidEmail(email)) {
                            break;
                        } else {
                            System.out.println("Invalid email format. Please try again.");
                        }
                    }

                    // Prompt for phone number with validation
                    String phoneNumber;
                    while (true) {
                        System.out.print("Enter your phone number (10 digits): ");
                        phoneNumber = scanner.nextLine();
                        if (isValidPhoneNumber(phoneNumber)) {
                            break;
                        } else {
                            System.out.println("Invalid phone number. Please enter a 10-digit number.");}}
                        
                 
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
                    scanner.close();  }}   }
                     // Validate email format
                        private static boolean isValidEmail(String email) {
                            String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
                            Pattern pattern = Pattern.compile(emailRegex);
                            return pattern.matcher(email).matches();
                        }

                        // Validate phone number format (10 digits)
                        private static boolean isValidPhoneNumber(String phoneNumber) {
                            return phoneNumber.matches("\\d{10}");
                        
           
         }

	

	
}


	

