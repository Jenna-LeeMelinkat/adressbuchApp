/**
 * @julian Hahnefeld
 * @Jenna-lee Melinkat
 *
 * zum erzeugen eines Adressbuchs mit Kontakten, als auch der Ausgabe
 */

/**
 * Die Main-Klasse erstellt ein Adressbuch und fügt Kontakte hinzu.
 * Es gibt auch die Möglichkeit, die Kontakte nach Namen zu suchen
 * und das Adressbuch auszugeben.
 * @author Jenna-Lee Melinkat
 * @author Julian Hahnefeld
 */
public class Main {

    /**
     * In dieser Methode werden Kontakte und Adressen erstellt und dem Adressbuch hinzugefügt.
     * Das Adressbuch wird ausgegeben, sowie die Kontakte, der Suche nach dem Namen "Drei".
     */
    public static void main(String[] args) {


        Contact contactUno = new Contact("contactUno", "Alkanani", new Address("Faulstrasse", "23552", "Kiel", "germany"), new Phone("+49", "0", "56323445"));
        Contact contactDos = new Contact("contactDos ", "Melinkat", new Address("Hauptsrasse", "23557", "Lübeck", "germany"), new Phone("+49", "0", "453565363"));
        Contact contactTres = new Contact("contactTres", "Mahnke", new Address("Langsamweg", "12445", "Lübeck", "germany"), new Phone("+49", "0", "123456789"));
        Contact contactCuatro = new Contact("contactCuatro", "Mahnke", new Phone("+49", "0", "123456789"));
        Contact contactCinco = new Contact("contactCinco", "Mahnke");
        Contact contactSeis = new Contact("contactSeis", "Mahnke", new Address("Langsamweg", "12445", "Lübeck", "germany"));


        AddressBook addressBook = new AddressBook();
        //Adressbuch adressbuch2 = new Adressbuch(kontaktUno);
        addressBook.addKontakt(contactUno);
        addressBook.addKontakt(contactDos);
        addressBook.addKontakt(contactTres);
        addressBook.addKontakt(contactCuatro);
        addressBook.addKontakt(contactCinco);
        addressBook.addKontakt(contactSeis);


        //Test 1
        //addressBook.removeContact(contactUno);
        //System.out.println(addressBook);
        //Test 2
        //addressBook.clearContacts();
        //System.out.println(addressBook);

        //ruft toString() mit auf
        //System.out.println("Gesamte Liste");
        //System.out.println(addressBook);


        //ruft toString() mit auf
        System.out.println("Suchresultate - byName");
        for (Contact contact : addressBook.findByName("Melinkat")) {
            System.out.println(contact.toString());
            System.out.println('\n');
        }

        System.out.println("Suchresultate - byAll");
        for (Contact contact : addressBook.searchAll("23557")) {
            System.out.println(contact.toString());
            System.out.println('\n');
        }
    }
}


