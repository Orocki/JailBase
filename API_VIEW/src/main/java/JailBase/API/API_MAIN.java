package JailBase.API;
import java.util.Scanner;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;

import com.google.gson.Gson;

public class API_MAIN
{

    public static void main(String args[]) throws Exception
    {

        CloseableHttpClient httpclient = HttpClients.createDefault();// Creating a HttpClient object

        // Creating a HttpGet object
        HttpGet httpget = new HttpGet("https://data.police.uk/api/crimes-street/all-crime?lat=52.629729&lng=-1.131592");

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
        Gson gson = new Gson();

        INMATE[] responseObjects = gson.fromJson(responseContent.toString(), INMATE[].class);

        System.out.println(responseObjects[0].getId());
    }
}
