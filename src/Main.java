/**
 * @julian Hahnefeld
 * @Jenna-lee Melinkat
 *
 * zum erzeugen eines Adressbuchs mit Kontakten, als auch der Ausgabe
 */

public class Main {

    /**
     * Kontakte werden erstellt
     * Adressbuch wird erstellt
     * Kontakte werden dem Adressbuch übergeben
     * Adressbuch wird ausgegeben
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

        //ruft tostring mit auf
        System.out.println("Gesamte Liste");
        System.out.println(addressBook);

        //ruft tostring mit auf
        System.out.println("Suchresultate");
        for (Contact contact : addressBook.findByName("Drei")) {
            System.out.println(contact.toString());
            System.out.println('\n');
        }
    }
}


