package JailBreak;
public class Inmate
{
    
    private String name;
    private String id;
    private String bookdate;
    private String charges;
    private String mugshot;
    
    
    public Inmate(String name, String id,String bookdate, String charges, String mugshot)
    {
        this.id = id;
        this.name = name;
        this.bookdate = bookdate;
        this.charges = charges;
        this.mugshot = mugshot;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getId()
    {
        return id;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    public String getBookdate()
    {
        return bookdate;
    }
    
    public void setBookdate(String bookdate)
    {
        this.bookdate = bookdate;
    }
    public String getCharges()
    {
        return charges;
    }
    
    public void setCharges(String charges)
    {
        this.charges = charges;
    }
    public String getMugshot()
    {
        return mugshot;
    }
    
    public void setMugshot(String mugshot)
    {
        this.mugshot = mugshot;
    }
    
    @Override
    public String toString()
    {
        return "Häftling-Name: " + getName() + "\nHäftling-Id: " + getId() + "\nHäftling-Bookdate:" + getBookdate() + "\nHäftling-Straftat: " + getCharges() + "\nHäftling-Mugshot: " +  getMugshot();
    }
    
}
