/**
 * Die Klasse Phone repräsentiert eine
 * Telefonnummer mit Vorwahl, Präfix und Nummer.
 * @author Jenna-Lee Melinkat
 * @author Julian Hahnefeld
 */
public class Phone extends Entry {

    private String areaCode;
    private String prefix;
    private String number;

    /**
     * Konstruktor für ein Phone-Objekt mit Vowahl, Präfix und Nummer.
     * @param areaCode die Vorwahl der Telefonnummer
     * @param prefix das Präfix der Telefonnummer
     * @param number die Nummer der Telefonnummer
     */
    public Phone(String areaCode, String prefix, String number){
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.number = number;
    }

    /**
     * Gibt die Vorwahl der Telefonnummer zurück.
     * @return areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Gibt das Präfix der Telefonnummer zurück.
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Gibt die Nummer der Telefonnummer zurück.
     * @return number
     */
    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        String phone =  "AreaCode: " + areaCode + '\n' +
                        "Präfix: " + prefix + '\n' +
                        "Nummer: " + number + '\n';
        return phone;
    }
}
