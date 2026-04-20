import java.io.*;
import java.net.*;
import java.util.Date;

public class SimpleWebServer {

    public static void main(String[] args) {
        int port = 8080;

        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Server started on port " + port);
            System.out.println("Open browser and type: http://localhost:8080");

            while (true) {
                Socket socket = server.accept();
                handleRequest(socket);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void handleRequest(Socket socket) {
        try {
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(socket.getOutputStream());

            String request = input.readLine();
            System.out.println("Client Request: " + request);

            String html =
                    "<html>" +
                    "<head><title>My Java Server</title></head>" +
                    "<body>" +
                    "<h1>Welcome to My Web Server</h1>" +
                    "<p>This server is made using Java Sockets.</p>" +
                    "<p>Current Time: " + new Date() + "</p>" +
                    "</body>" +
                    "</html>";

            output.println("HTTP/1.1 200 OK");
            output.println("Content-Type: text/html");
            output.println("Content-Length: " + html.length());
            output.println();
            output.println(html);

            output.flush();
            socket.close();

        } catch (Exception e) {
            System.out.println("Request Error: " + e.getMessage());
        }
    }
}