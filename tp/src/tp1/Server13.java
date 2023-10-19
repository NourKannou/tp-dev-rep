package tp1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	            int x = is.read();
	            
	            int rep = 0 ;
	            switch (x){
	            case 1: rep=nb*5; break;
	            case 2: rep=nb-5; break;
	            case 3: rep=nb/5; break;
	            case 4: rep=nb+5; break;
	            }
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
