package PersonInformation;

public class ContactDetails {
	String phone;
    String email;

    public ContactDetails(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Phone:" + phone + "\n" + "Email:" + email;
    }


}
