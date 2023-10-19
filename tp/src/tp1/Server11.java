package tp1;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

public class Server11 {

    public static void main(String[] args) {
        try {
           
            int port = 1234;
            ServerSocket s = new ServerSocket(port);
            System.out.println("Server is listening on port " + port);


            // Accept a client connection
            Socket ss = s.accept();
            System.out.println("Client connected " );

            
            // Remember to close the client socket and server socket when done.
            ss.close();
            ss.close();
        } catch (IOException e) {
            // Handle exceptions here
            e.printStackTrace();
        }
    }

}
