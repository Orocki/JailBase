package JailBreak;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiJson {
    
    private final String response;
    
    public ApiJson(String url) {
        HttpClient client = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.ALWAYS).build();
        
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        
        try {
            HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            if (httpResponse.statusCode() != 200) {
                throw new IOException("Unexpected response code: " + httpResponse.statusCode());
            }
            
            response = httpResponse.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error making HTTP request", e);
        }
    }
    
    public String getResponse() {
        return response;
    }
}
