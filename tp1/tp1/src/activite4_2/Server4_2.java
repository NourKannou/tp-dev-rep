package activite4_2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server4_2 extends Thread {
	int ord =1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   new Server4_2().start();}
    
	
	public void run ()
	{try {
		ServerSocket ss= new ServerSocket(1234);
		while(true) {
			Socket s = ss.accept();
			System.out.println("le serveur attend le client");
			ClientProcess cp= new ClientProcess(s,ord++);
			cp.start();
		}
		
		
		ss.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	
	}
    
    
	
	

}
