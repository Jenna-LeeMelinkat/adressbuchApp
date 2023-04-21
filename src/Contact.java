/**
 * @julian Hahnefeld
 * @Jenna-lee Melinkat
 *
 */
public class Contact {

    private String firstName;
    private String lastName;
    private Address address;
    private Phone phone;




    public Contact(String firstName, String lastName, Address address, Phone phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }
    public Phone getPhone() {
        return phone;
    }


    /**
     * toString() Methode
     * gibt die Kontaktdaten eines Kontaktes als String zurück
     *
     */
    public String toString() {
       String kontaktdaten = "Vorname: " + firstName + '\n' +
               "Nachname: " + lastName + '\n' + address + '\n' + phone ;
       return kontaktdaten;
    }





}
