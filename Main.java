package JailBreak;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {
        // Set the required information
        String apiKey = "60d195fde8msh2c7ecfb446918d2p19e9f3jsn262c2c5451a2";
        String host = "jailbase-jailbase.p.rapidapi.com";
        String sourceId = "az-mcso";  // Replace with the actual value
        
        // Build the request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jailbase-jailbase.p.rapidapi.com/recent/?source_id=" + sourceId))
                .header("X-RapidAPI-Key", apiKey)
                .header("X-RapidAPI-Host", host)
                .GET()
                .build();
        
        // Send the request and get the response
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        
        // Print the response body
        Gson gson = new Gson();
        
        // Parse the JSON response
        JailBaseResponse jailBaseResponse = gson.fromJson(response.body(), JailBaseResponse.class);
        
        // Check if there are records
        if (jailBaseResponse.getRecord() != null && !jailBaseResponse.getRecord().isEmpty()) {
            // Get the first record (assumes there is at least one)
            Record firstRecord = jailBaseResponse.getRecord().get(1);
            
            // Print the name of the inmate
            System.out.println("Inmate Name: " + firstRecord.getName());
        } else {
            System.out.println("No records found in the response.");
        }
    }
}
