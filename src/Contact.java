/**
 * @julian Hahnefeld
 * @Jenna-lee Melinkat
 *
 */
public class Kontakt {

    private String firstName;
    private String nachname;
    private String strasse;
    private int postleitzahl;
    private String stadt;
    private String land;

    public Kontakt(String firstName, String nachname, String strasse, int postleitzahl, String stadt, String land) {
        this.firstName = firstName;
        this.nachname = nachname;
        this.strasse = strasse;
        this.postleitzahl = postleitzahl;
        this.stadt = stadt;
        this.land = land;
    }


    /**
     * toString() Methode
     * gibt die Kontaktdaten eines Kontaktes als String zurück
     *
     */
    public String toString() {
       String kontaktdaten = "Vorname: " + firstName + '\n' +
               "Nachname: " + nachname + '\n' +
               "Straße: " + strasse + '\n' +
               "Postleitzahl: " + postleitzahl + '\n' +
               "Stadt: " + stadt + '\n' +
               "Land: " + land;
       return kontaktdaten;
    }





}
