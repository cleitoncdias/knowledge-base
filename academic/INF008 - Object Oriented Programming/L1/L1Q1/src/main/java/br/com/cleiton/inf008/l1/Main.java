package br.com.cleiton.inf008.l1;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {

        // 1. Creating the address book
        AddressBook myBook = new AddressBook();
        System.out.println("Address Book created.\n");

        // 2. Testing list contacts with an empty address book
        myBook.getAllContacts();

        // 3. Adding some contacts
        System.out.println("\n--- Adding new contacts ---");
        Contact contact1 = new Contact("Ana Silva", "71 9999-0001", "ana.silva@email.com");
        Contact contact2 = new Contact("Bruno Costa", "71 9888-0002");
        Contact contact3 = new Contact("Carlos Dias", "11 9777-0003", "carlos.dias@email.com");

        myBook.addContact(contact1);
        myBook.addContact(contact2);
        myBook.addContact(contact3);

        // 4. Listing all contacts again
        System.out.println("\n--- Listing contacts after adding ---");
        myBook.getAllContacts();

        // 5. Searching for contacts
        System.out.println("\n--- Finding contacts ---");

        // Test 5a: Searching for a contact that exists (case-insensitive)
        myBook.findContactByName("bruno costa");
        System.out.println();

        // Test 5b: Searching for a contact that does not exist
        myBook.findContactByName("Mariana");

        // 6. Testing the address book's limit
        System.out.println("\n--- Testing address book limit ---");
        myBook.addContact(new Contact("David", "111-111"));
        myBook.addContact(new Contact("Elias", "222-222"));
        myBook.addContact(new Contact("Fabio", "333-333"));
        myBook.addContact(new Contact("Gisele", "444-444"));
        myBook.addContact(new Contact("Hugo", "555-555"));
        myBook.addContact(new Contact("Igor", "666-666"));
        myBook.addContact(new Contact("Julia", "777-777"));

        // Trying to add the 11th contact (should fail)
        System.out.println();
        myBook.addContact(new Contact("Lucas", "888-888"));

        // 7. Checking the final contact list
        System.out.println("\n--- Final contact list ---");
        myBook.getAllContacts();
    }
}
