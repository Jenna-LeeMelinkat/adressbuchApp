
import java.util.*;

/**
 * Die Klasse AddressBook repräsentiert eine Sammlung von Kontakten.
 * Sie ermöglicht das Hinzufügen, Entfernen und Suchen von
 * Kontakten nach Namen.
 * @author Jenna-Lee Melinkat
 * @author Julian Hahnefeld
 */
public class AddressBook {

    Set<Contact> contactsSet; // Die Liste der Kontakte im Adressbuch.

    /**
     * Konstruiert ein leeres Adressbuch.
     */
    public AddressBook() {
        contactsSet = new HashSet<Contact>() {

        };
    }

    /**
     * Konstruiert ein Adressbuch mit einem einzigen Kontakt.
     * falls man ein Adressbuch direkt mit einem Kontakt erstellen möchte
     * @param contact der Kontakt, der dem Adressbuch hinzugefügt werden soll.
     */
    public AddressBook(Contact contact) {
        contactsSet = new HashSet<Contact>() {

        };
        addKontakt(contact);
    }

    /**
     * Fügt einen Kontakt zum Adressbuch hinzu.
     * @param neuerContact der Kontakt, der hinzugefügt werden soll.
     */
    void addKontakt(Contact neuerContact){
        contactsSet.add(neuerContact);
    }

    /**
     * Entfernt einen Kontakt aus dem Adressbuch.
     * @param contact der zu entfernende Kontakt.
     */
    void  removeContact(Contact contact){
        contactsSet.remove(contact);
    }

    /**
     * Entfernt alle Kontakte aus dem Adressbuch.
     */
    void clearContacts(){
        contactsSet.clear();
    }

    /**
     * Sucht nach Kontakten im Adressbuch, die den angegebenen
     * Namen enthalten (Groß-/Kleinschreibung wird ignoriert).
     * @param name der zu suchende Name.
     * @return eine Liste (searchresults) von Kontakten, die den Namen enthalten.
     */
    //equals Anna -> Annabelle
    public Set<Contact> findByName(String name){
        name = name.toLowerCase().trim();
        Set<Contact> searchresults = new HashSet<>();
        for (Contact contact : contactsSet) {
            if(contact.getFirstName().toLowerCase().contains(name) || contact.getLastName().toLowerCase().contains(name)){
                searchresults.add(contact);
            }
        }
        return searchresults;
    }

    @Override
    public String toString() {
        StringBuilder outputString = new StringBuilder();
        for (Contact contact : contactsSet) {
            outputString.append(contact.toString()).append('\n').append('\n');
        }
        return outputString.toString();
    }
}
