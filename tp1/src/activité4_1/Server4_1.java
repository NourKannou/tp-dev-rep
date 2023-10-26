package activité4_1;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import activite32.ClientProcess;

public class Server4_1 extends Thread{
	int ord =1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
new Server4_1 ().start();

	}
	public void run() {
		try {
			ServerSocket ss= new ServerSocket(1234);
		while(true) {
			
			Socket socket =ss.accept();
			System.out.println("le serveur attend le cliend");
			
            new ClientProcess(socket, ord++).start(); }
		
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
