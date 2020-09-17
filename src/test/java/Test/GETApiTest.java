package Test;

import Client.RestClient;
import TestBase.baseclass;
import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class GETApiTest extends baseclass {

    baseclass base ;
    String url;

    @BeforeMethod
    public void setUp() throws IOException {
      base = new baseclass();
      String sserviceurl = prop.getProperty("url");
    String Apiurl =   prop.getProperty("serviceurl");

   url = sserviceurl + Apiurl;
    }
    @Test
    public void getTest() throws ClientProtocolException,IOException {
        RestClient restClient = new RestClient();
        restClient.get(url);
    }



}
