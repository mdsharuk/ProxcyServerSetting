package Com.bd.proxcySetting;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class ProxcySetting {
    public static void main(String[] args) throws Exception,IOException{
        HttpClient http_Client=HttpClient.newBuilder()
                .proxy(ProxySelector.of(new InetSocketAddress
                        ("proxcyhost",87))).build();
        HttpRequest http_Request=HttpRequest.newBuilder()
                .uri(URI.create("https://www.youtube.com/")).build();
        HttpResponse<String>Http_Response=http_Client.send
                (http_Request,HttpResponse.BodyHandlers.ofString());
       throw new Exception("Status Code :"+Http_Response.statusCode());
           new Exception("n/ body :"+Http_Response.body());


    }
}
