package PersonInformation;

public class Person  {
	
	 String name;
	    int age;
	    ContactDetails contactDetails;
	    Country country;

	    public Person(String name, int age, ContactDetails contactDetails,Country country) {
	        this.name = name;
	        this.age = age;
	        this.contactDetails = contactDetails;
	        this.country =country;
	    }

	    @Override
	    public String toString() {
	        return "NAME:" + name + "\n" + "AGE:" + age +" years old"+"\n" + contactDetails + "\n" + country;
	    }
	}
