package activite12;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Serveur {

    public static void main(String[] args) {
        try {
           
            int port = 1234;
            ServerSocket s = new ServerSocket(port);
            System.out.println("Server is listening on port " + port);


            // Accept a client connection
            Socket ss = s.accept();
            System.out.println("Client connected " );

            // You can now handle the client's communication here.
            OutputStream os = ss.getOutputStream();
            InputStream is = ss.getInputStream();
           
            int nb = is.read();
            int rep = nb*5;
            os.write(rep);
            
            // Remember to close the client socket and server socket when done.
            ss.close();
            ss.close();
        } catch (IOException e) {
            // Handle exceptions here
            e.printStackTrace();
        }
    }
}