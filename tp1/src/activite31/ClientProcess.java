package activite31;

import java.io.PrintWriter;
import java.net.Socket;

public class ClientProcess extends Thread{
	Socket socket ;
	int ord;



public ClientProcess(Socket socket, int ord) {
		super();
		this.socket = socket;
		this.ord = ord;
	}



public void run() {
	try {

	PrintWriter pw =new PrintWriter(socket.getOutputStream(),true);
	pw.println("connecté client num"+ ord +"votre adresse IP"+socket.getRemoteSocketAddress()); }
	catch(Exception e) {e.printStackTrace();}
}

	}


