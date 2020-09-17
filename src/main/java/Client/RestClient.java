package Client;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;

public class RestClient {

    //Get method
    public void get(String url) throws IOException {   // call paricular url
       CloseableHttpClient HttpClient = HttpClients.createDefault();  // createdefault methos will create one client connection and return http client object
        HttpGet httpget = new HttpGet(url); // it will create http get connection to url // httpget request
       CloseableHttpResponse response =  HttpClient.execute(httpget); // hit the GET URL
       int statuscode =  response.getStatusLine().getStatusCode(); // return inteer
        System.out.println("status code" + statuscode);


       String st =  EntityUtils.toString(response.getEntity(), "UTF-8");

       // convert string to json

        JSONObject  responsejson = new JSONObject(st);
        System.out.println("response json from Apir"+ responsejson);

        // to get all header

        Header[] headerarray = response.getAllHeaders();
        HashMap<String , String > allhashmap = new HashMap<String, String>();
        for(Header header : headerarray){
            allhashmap.put(header.getName(), header.getValue());

        }
        System.out.println("Header Array"+ allhashmap);






    }
}
