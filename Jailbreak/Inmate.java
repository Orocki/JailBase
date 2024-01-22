package JailBreak;

import com.google.gson.Gson;
import java.util.List;
//Implements Interface
public class Inmate implements Mate {
    
    private List<Records> inmates;
    
    public List<Records> getInmates() {
        return inmates;
    }
    
    public void setInmates(List<Records> inmates) {
        this.inmates = inmates;
    }
    
    @Override
    public void fill(String jail) {
        String URL = "http://www.JailBase.com/api/1/recent/?source_id="+jail;
        String response = new ApiJson(URL).getResponse();
        Gson gson = new Gson();
        JailBaseResponse jailBaseResponse = gson.fromJson(response, JailBaseResponse.class);
        setInmates(jailBaseResponse.getRecords());
        //For Each Schleife
        for (Records records : getInmates()) {
            System.out.print(records.toString());//Ausgabe der toString
        }
    }
}
