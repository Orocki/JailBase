package JailBreak;

import java.util.List;

public class JailBaseResponse {
    private int status;
    private int next_page;
    private List<Records> records;
    
    public List<Records> getRecords() {
        return records;
    }
}
