package JailBreak;

import java.util.Scanner;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;

//import com.goggle.gson.Gson;
//Library einfügen für google
public class Main
{
    public static void main(String[] args) throws Exception
    {
        // Creating a HttpClient object
        CloseableHttpClient httpclient = HttpClients.createDefault();
        
        // Creating a HttpGet object
        HttpGet httpget = new HttpGet("jailbase-jailbase.p.rapidapi.com");
        
        // Printing the method used
        System.out.println("Request Type: " + httpget.getMethod());
        
        // Executing the Get request
        ClassicHttpResponse httpresponse = httpclient.execute(httpget);
        
        // Printing the status line
        System.out.println("Status Line: " + httpresponse.getCode() + " " + httpresponse.getReasonPhrase());
        
        // Reading the response content
        Scanner sc = new Scanner(httpresponse.getEntity().getContent());
        StringBuilder responseContent = new StringBuilder();
        while (sc.hasNext()) {
            responseContent.append(sc.nextLine());
        }
        
        httpclient.close();
        //Gson gson = new Gson();
        
        //Inmate[] responseObjects = gson.fromJson(responseContent.toString(), Inmate[].class);
        
        //System.out.println(responseObjects[0].getId());
    }
}