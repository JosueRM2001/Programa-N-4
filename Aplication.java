import java.io.IOException;
import java.io.OutputStream;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class Aplication {
    public static void main(String[] args) throws IOException {
        // Set the server to listen on port 9000
        HttpServer server = HttpServer.create(new java.net.InetSocketAddress(9000), 0);
        server.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String response = "Welcome! This is a Java application";
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });
        server.start();
        System.out.println("Server is listening on port 9000...");
    }
}

