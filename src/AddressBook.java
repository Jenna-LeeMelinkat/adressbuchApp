
import java.util.LinkedList;
import java.util.List;

/**
 * Die Klasse AddressBook repräsentiert eine Sammlung von Kontakten.
 * Sie ermöglicht das Hinzufügen, Entfernen und Suchen von
 * Kontakten nach Namen.
 */
public class AddressBook {

    LinkedList<Contact> contacts; // Die Liste der Kontakte im Adressbuch.

    /**
     * Konstruiert ein leeres Adressbuch.
     */
    public AddressBook() {
        contacts = new LinkedList<>();
    }

    /**
     * Konstruiert ein Adressbuch mit einem einzigen Kontakt.
     * falls man ein Adressbuch direkt mit einem Kontakt erstellen möchte
     * @param contact der Kontakt, der dem Adressbuch hinzugefügt werden soll.
     */
    public AddressBook(Contact contact) {
        contacts = new LinkedList<Contact>();
        addKontakt(contact);
    }

    /**
     * Fügt einen Kontakt zum Adressbuch hinzu.
     * @param neuerContact der Kontakt, der hinzugefügt werden soll.
     */
    void addKontakt(Contact neuerContact){
        contacts.add(neuerContact);
    }

    /**
     * Entfernt einen Kontakt aus dem Adressbuch.
     * @param contact der zu entfernende Kontakt.
     */
    void  removeContact(Contact contact){
        contacts.remove();
    }

    /**
     * Entfernt alle Kontakte aus dem Adressbuch.
     */
    void clearContacts(){
        contacts.clear();
    }

    /**
     * Sucht nach Kontakten im Adressbuch, die den angegebenen
     * Namen enthalten (Groß-/Kleinschreibung wird ignoriert).
     * @param name der zu suchende Name.
     * @return eine Liste (searchresults) von Kontakten, die den Namen enthalten.
     */
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
     * Gibt das Adressbuch als String mit allen Kontakten aus.
     * @return Adressbuch als String
     */
    public String toString() {
        StringBuilder outputString = new StringBuilder();
        for (Contact contact : contacts) {
            outputString.append(contact.toString()).append('\n').append('\n');
        }
        return outputString.toString();
    }
}
