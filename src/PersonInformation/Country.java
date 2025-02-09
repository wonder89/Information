package PersonInformation;

public class Country {
	String countryname;
    String state;
    String city;
    Double code;

    public Country(String countryname, String state, String city,Double code) {
        this.countryname = countryname;
        this.state = state;
        this.city = city;
        this.code = code;
    }

    @Override
    public String toString() {
        return "countryname:" + countryname + "\n" + "state:" + state +"\n" + "city:" + city + "\n" +"code:" + code;
    }



}
