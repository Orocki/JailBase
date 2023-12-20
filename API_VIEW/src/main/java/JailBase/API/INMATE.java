package JailBase.API;

public class INMATE
{
    private String bookdate;
    private String charges;
    private String name;
    private String id;

    private String mugshot;


    public INMATE(String name, String id)
    {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString()
    {
        return "Häftling-Name:" + getName() + "\nHäftling-Id:" + getId() + "";
    }

}