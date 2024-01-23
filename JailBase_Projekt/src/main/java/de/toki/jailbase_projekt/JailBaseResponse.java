package de.toki.jailbase_projekt;

import java.util.List;

public class JailBaseResponse {
    protected int status;
    protected int next_page;
    protected List<Records> records;
    
    public List<Records> getRecords() {
        return records;
    }
}
