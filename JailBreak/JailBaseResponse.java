package JailBreak;

import java.util.List;

public class JailBaseResponse
{
    private int status;
    private int next_page;
    private List<Record> inmate;
    
    public int getStatus()
    {
        return status;
    }
    
    public int getNext_page()
    {
        return next_page;
    }
    
    public List<Record> getRecord()
    {
        return inmate;
    }
}


class Record {
    private String book_date_formatted;
    private String name;
    private String mugshot;
    
    // Add getters and setters
    // ...
    
    public String getName() {
        return name;
    }
}