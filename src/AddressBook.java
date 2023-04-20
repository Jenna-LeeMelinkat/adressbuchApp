
import java.util.LinkedList;

/**
 * @julian Hahnefeld
 * @Jenna-lee Melinkat
 *
 */
public class Adressbuch {

    LinkedList<Contact> contactListe;

    /**
     * Adressbuch()
     * leeres Adressbuch
     * wird erstellt
     *
     */
    public Adressbuch() {
        contactListe = new LinkedList<>();
    }


    /**
     * Adressbuch()
     * mit Parameter Kontakt kontakt
     * Konstruktor, falls man ein Adressbuch mit direkt einem Kontakt
     * erstellen möchte
     *
     */
    public Adressbuch(Contact contact) {
        contactListe = new LinkedList<Contact>();
        addKontakt(contact);
    }


    /**
     * addKontakt()
     * hat den Parameter Kontakt neuerKontakt
     * und fügt einen neuen Kontakt der Kontaktliste hinzu
     *
     */
    void addKontakt(Contact neuerContact){
        contactListe.add(neuerContact);
    }


    /**
     * toString() durchläuft die komplette Kontaktliste und
     * fügt die Kontakte jeweils zum bisherigen hinzu
     * gibt die Kontaktliste wieder
     *
     */
    public String toString() {
        StringBuilder outputString = new StringBuilder();
        for (Contact contact : contactListe) {
            outputString.append(contact.toString()).append('\n').append('\n');
        }
        return outputString.toString();
    }
}
