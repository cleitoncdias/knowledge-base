package br.com.cleiton.inf008.l1;

public class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone){
        setName(name);
        setPhone(phone);
    }

    public Contact(String name, String phone, String email){
        this(name, phone);
        setEmail(email);
    }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }

    public String getPhone(){ return this.phone; }
    public void setPhone(String phone){ this.phone = phone; }

    public String getEmail(){ return this.email; }
    public void setEmail(String email){ this.email = email; }

    @Override
    public String toString(){
        return String.format(
            "\nName: %s\nPhone: %s\nEmail: %s\n",
            this.getName(), this.getPhone(), this.getEmail()
        );
    }

    public void displayInfo(){ System.out.println(this); }

    public void updateContact(String phone, String email){
        setPhone(phone);
        setEmail(email);
    }
}
