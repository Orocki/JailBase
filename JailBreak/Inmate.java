package JailBreak;

public class Inmate
{
    private String name;
    private String id;
    private String book_date_formatted;
    private String charges;
    private String mugshot;
    
    
    public Inmate(String name, String id, String book_date_formatted, String charges, String mugshot)
    {
        this.id = id;
        this.name = name;
        this.book_date_formatted = book_date_formatted;
        this.charges = charges;
        this.mugshot = mugshot;
    }
    
    public String getName()
    {
        return name;
    }
    
    
    public String getId()
    {
        return id;
    }
    
    public String getBook_date_formatted()
    {
        return book_date_formatted;
    }
    
    public String getCharges()
    {
        return charges;
    }
    
    
    public String getMugshot()
    {
        return mugshot;
    }
    
    
    @Override
    public String toString()
    {
        return "Häftling-Name: " + getName() + "\nHäftling-Id: " + getId() + "\nHäftling-Bookdate:" + getBook_date_formatted() + "\nHäftling-Straftat: " + getCharges() + "\nHäftling-Mugshot: " + getMugshot();
    }
    
}
