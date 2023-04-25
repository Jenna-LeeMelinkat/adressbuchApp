/**
 * Die Klasse Address repräsentiert eine Adresse mit Straße, Postleitzahl, Stadt und Land.
 * @author Jenna-Lee Melinkat
 * @author Julian Hahnefeld
 */
public class Address {

    private String street;
    private String postalCode;
    private String city;
    private String country;

    /**
     * Konstruiert eine Adresse mit der angegebenen Straße, Postleitzahl, Stadt und Land.
     * @param street die Strasse der Adresse.
     * @param postalCode die Postleitzahl der Adresse.
     * @param city die Stadt der Adresse.
     * @param country das Land der Adresse.
     */
    public Address (String street, String postalCode, String city, String country){
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    /**
     * Gibt die Strasse der Adresse zurück.
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Gibt die Postleitzahl der Adresse zurück.
     * @return postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Gibt die Stadt der Adresse zurück.
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Gibt das Land der Adresse zurück.
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Gibt die Adresse als String zurück.
     * @return kontaktdaten
     */
    public String toString() {
        String kontaktdaten =
                "Straße: " + street + '\n' +
                        "Postleitzahl: " + postalCode + '\n' +
                        "Stadt: " + city + '\n' +
                        "Land: " + country;
        return kontaktdaten;
    }
}
