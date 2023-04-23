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

        Address addressUno = new Address( "Nikestraße", "63458", "Hamburg", "Deutschland");
        Address addressDos = new Address( "Pizzastraße", "78910", "Blanes", "Spanien");
        Address addressTres = new Address( "Pizzastraße", "78910", "Blanes", "Spanien");

        Contact contactUno = new Contact("drei", "Alkanani", new Address("Faulstrasse", "23552", "Kiel", "germany"), new Phone("+49", "0", "56323445"));
        Contact contactDos = new Contact("Drei ", "Melinkat", new Address("Hauptsrasse", "23557", "Lübeck", "germany"), new Phone("+49", "0", "453565363"));
        Contact contactTres = new Contact("Drei", "Mahnke", new Address("Langsamweg", "12445", "Lübeck", "germany"), new Phone("+49", "0", "123456789"));
        //Contact contactCuatro = new Contact("Eins", "Alkanani", addressUno);

        AddressBook addressBook = new AddressBook();
        //Adressbuch adressbuch2 = new Adressbuch(kontaktUno);
        addressBook.addKontakt(contactUno);
        addressBook.addKontakt(contactDos);
        addressBook.addKontakt(contactTres);

        //ruft toString() mit auf
        System.out.println("Gesamte Liste");
        System.out.println(addressBook);

        //ruft toString() mit auf
        System.out.println("Suchresultate");
        for (Contact contact : addressBook.findByName("Drei")) {
            System.out.println(contact.toString());
            System.out.println('\n');
        }
    }
}


