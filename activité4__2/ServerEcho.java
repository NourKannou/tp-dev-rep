package activité4__2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerEcho {
	private static final int port=1236;
	private static byte[] buffer = new byte[1024];
public static void main (String[]args) throws IOException {
	DatagramSocket socket = new DatagramSocket(port);
	System.out.println("demarrage du serveur");
	while(true) {
		DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
		
	//constructeur packet chez le client 2 parameters (receive) par contre chez le client 4 parameters(send)
	    socket.receive(packet);
		
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String dateTime = dateFormat.format(new Date());
			
		    DatagramPacket msg = new DatagramPacket(dateTime.getBytes(),dateTime.length(),
				                                packet.getAddress(),packet.getPort());
	
		  //4 parametres : tab de octets , longueur de message ou du tab , address du client , le port du client
		socket.send(msg);
	}}
}


