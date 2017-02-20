package sample;

/**
 * Created by peter on 2/20/17.
 */
public class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    String toString() {
        return String.format( "%s, %s, %s", this.name, this.phone, this.email );
        //System.out.printf("%s, %s, %s" this.name, this.phone, this.email);
    }
}
