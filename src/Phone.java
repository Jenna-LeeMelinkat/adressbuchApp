public class Phone {

    private String areaCode;
    private String prefix;
    private String number;

    public Phone(String areaCode, String prefix, String number){
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getNumber() {
        return number;
    }
    public String toString() {
        return "Phone: " + '\n' +
                "AreaCode: " + areaCode + '\n' +
                "Präfix: " + prefix + '\n' +
                "Nummer: " + number + '\n'
                ;
    }
}
