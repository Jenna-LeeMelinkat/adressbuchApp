public class Address {

    private String street;
    private String postalCode;
    private String city;
    private String country;

    public Address (String street, String postalCode, String city, String country){
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String toString() {
        String kontaktdaten =
                "Straße: " + street + '\n' +
                        "Postleitzahl: " + postalCode + '\n' +
                        "Stadt: " + city + '\n' +
                        "Land: " + country;
        return kontaktdaten;
    }
}
