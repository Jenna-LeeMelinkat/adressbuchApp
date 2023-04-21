
import java.util.LinkedList;
import java.util.List;

/**
 * @julian Hahnefeld
 * @Jenna-lee Melinkat
 *
 */
public class AddressBook {

    LinkedList<Contact> contacts;

    /**
     * Adressbuch()
     * leeres Adressbuch
     * wird erstellt
     *
     */
    public AddressBook() {
        contacts = new LinkedList<>();
    }


    /**
     * Adressbuch()
     * mit Parameter Kontakt kontakt
     * Konstruktor, falls man ein Adressbuch mit direkt einem Kontakt
     * erstellen möchte
     *
     */
    public AddressBook(Contact contact) {
        contacts = new LinkedList<Contact>();
        addKontakt(contact);
    }


    /**
     * addKontakt()
     * hat den Parameter Kontakt neuerKontakt
     * und fügt einen neuen Kontakt der Kontaktliste hinzu
     *
     */
    void addKontakt(Contact neuerContact){
        contacts.add(neuerContact);
    }
    void  removeContact(Contact contact){
        contacts.remove();
    }
    void clearContacts(){
        contacts.clear();
    }
    public LinkedList<Contact> findByName(String name){
        name = name.toLowerCase().trim();
        LinkedList<Contact> searchresults = new LinkedList<>();
        for (Contact contact : contacts) {
            if(contact.getFirstName().toLowerCase().contains(name) || contact.getLastName().toLowerCase().contains(name)){
                searchresults.add(contact);
            }
        }
        return searchresults;
    }

    /**
     * toString() durchläuft die komplette Kontaktliste und
     * fügt die Kontakte jeweils zum bisherigen hinzu
     * gibt die Kontaktliste wieder
     *
     */
    public String toString() {
        StringBuilder outputString = new StringBuilder();
        for (Contact contact : contacts) {
            outputString.append(contact.toString()).append('\n').append('\n');
        }
        return outputString.toString();
    }
}
