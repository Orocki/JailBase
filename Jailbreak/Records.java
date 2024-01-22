package JailBreak;

import java.util.List;

public class Records {
    private String book_date_formatted;
    private String name;
    private String mugshot;
    private String id;
    private List<String> charges;
    
    public Records(String book_date_formatted, String name, String mugshot, String id, List<String> charges) {
        this.book_date_formatted = book_date_formatted;
        this.name = name;
        this.mugshot = mugshot;
        this.id = id;
        this.charges = charges;
    }
    
    public String getName() {
        return name;
    }
    public List<String> getCharges() {
        return charges;
    }
    public String getMugshot() {
        return mugshot;
    }
    public String getId() {
        return id;
    }
    public String getBook_date_formatted() {
        return book_date_formatted;
    }
    //Ausgabe in Konsole
    @Override
    public String toString()
    {
        return "Records{" + "book_date_formatted='" + book_date_formatted + '\'' + ", name='" + name + '\'' + ", mugshot='" + mugshot + '\'' + ", id='" + id + '\'' + ", charges=" + charges + '}';
    }
}
