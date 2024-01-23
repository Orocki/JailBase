package de.toki.jailbase_projekt;
import java.util.List;

public class Records {
    protected String book_date_formatted;
    protected String name;
    protected String mugshot;
    protected String id;
    protected List<String> charges;
    
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
    public void setMugshot(String mug)
    {
        this.mugshot = mug;
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
