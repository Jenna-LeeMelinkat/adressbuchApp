/**
 * Die Contact-Klasse repräsentiert einen Kontakt
 * mit Vorname, Nachname, Adresse und Telefonnummer.
 * @author Jenna-Lee Melinkat
 * @author Julian Hahnefeld
 */
public class Contact {

    private String firstName;
    private String lastName;
    private Address address;
    private Phone phone;

    /**
     * Konstruktor der Contact-Klasse
     * @param firstName
     * @param lastName
     * @param address
     * @param phone
     */
    public Contact(String firstName, String lastName, Address address, Phone phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Gibt den Vornamen des Kontakts zurück.
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gibt den Nachnamen des Kontakts zurück.
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gibt die Adresse des Kontakts zurück.
     * @return address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Gibt die Telefonnummer des Kontakts zurück.
     * @return phone
     */
    public Phone getPhone() {
        return phone;
    }

    /**
     * Gibt die Kontaktdaten eines Kontakts als String zurück
     * @return kontaktdaten
     */
    public String toString() {
       String kontaktdaten = "Vorname: " + firstName + '\n' +
               "Nachname: " + lastName + '\n' + address + '\n' + phone ;
       return kontaktdaten;
    }
}
