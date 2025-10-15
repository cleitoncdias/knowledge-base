public class AddressBook {
    Contact[] addressBook = new Contact[10];
    int contactCount;

    public void addContact(Contact contact){
        if(contactCount < addressBook.length){
            this.addressBook[contactCount] = contact;
            contactCount++;
        } else{
            System.out.println("This adress book is full");
        }
    }

    public void findContactByName(String name){
        for(int i = 0; i < this.contactCount; i++){
            if((this.addressBook[i].getName()).equalsIgnoreCase(name)){
                System.out.printf("Contact found on position %s.\n", (this.contactCount + 1));
                this.addressBook[i].displayInfo();
                return;
            }
        }
        System.out.println("Contact not founded.");
    }

    public void getAllContacts(){
        System.out.println("ALL CONTACTS\n");
        if(contactCount == 0){
            System.out.println("No contacts added.\n");
        }else{
            for(int i = 0; i < this.contactCount; i++){
                this.addressBook[i].displayInfo();
            }
        }
    }
}