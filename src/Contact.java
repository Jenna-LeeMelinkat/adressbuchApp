import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Die Contact-Klasse repräsentiert einen Kontakt
 * mit Vorname, Nachname, Adresse und Telefonnummer.
 * @author Jenna-Lee Melinkat
 * @author Julian Hahnefeld
 */
public class Contact {

    private String firstName;
    private String lastName;
    private Set<Address> addressesSet;
    private Set<Phone> phonesSet;

    /**
     * Konstruktor der Contact-Klasse
     * @param firstName Vorname des Kontakts
     * @param lastName Nachname des Kontakts
     * @param address Adresse des Kontakts
     * @param phone Telefonnummer des Kontakts
     */
    public Contact(String firstName, String lastName, Address address, Phone phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressesSet = new HashSet<>();
        addressesSet.add(address);
        this.phonesSet = new HashSet<>();
        phonesSet.add(phone);
    }

    public Contact(String firstName, String lastName, Address address) {
        this(firstName,lastName,address,new Phone("","",""));
    }

    public Contact(String firstName, String lastName, Phone phone) {
        this(firstName,lastName,new Address("","","",""),phone);
    }

    public Contact(String firstName, String lastName) {
        this(firstName,lastName,new Phone("","",""));
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
    public Set<Address> getAddressesSet() {return addressesSet; }

    /**
     * Gibt die Telefonnummer des Kontakts zurück.
     * @return phone
     */
    public Set getPhone() {return phonesSet; }

    @Override
    public String toString() {
       String kontaktdaten = "Vorname: " + firstName + '\n' +
               "Nachname: " + lastName + '\n' + addressesSet + '\n' + phonesSet ;
       return kontaktdaten;
    }

    public Set<Address> getAddresses(){
        return addressesSet;
    }

    public boolean hasAddress(){
        return !addressesSet.isEmpty();
    }

    public void addAddresses(Address newAddress){
        addressesSet.add(newAddress);
    }

    public void removeAddress(Address address){
        addressesSet.remove(address);
    }

    public void clearAddresses(){
        addressesSet.clear();
    }

    public Set<Phone> getPhones(){
        return phonesSet;
    }

    public boolean hasPhone(){
        return !phonesSet.isEmpty();
    }

    public void addPhone(Phone newPhone){
        phonesSet.add(newPhone);
    }

    public void removePhone(Phone phone){
        phonesSet.remove(phone);
    }

    public void clearPhones(){
        phonesSet.clear();
    }
}
