package activite31;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurMT extends Thread{
	int ord =1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
new ServeurMT ().start();

	}
	public void run() {
		try {
			ServerSocket ss= new ServerSocket(1234);
		while(true) {
			
			Socket socket =ss.accept();
			ClientProcess client = new ClientProcess(socket,ord++);
			client.start();
		}
		
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
