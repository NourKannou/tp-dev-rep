package activité4__1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerEcho {
	private static final int port=1235;
	private static byte[] buffer = new byte[1024];
public static void main (String[]args) throws IOException {
	DatagramSocket socket = new DatagramSocket(port);
	System.out.println("demarrage du serveur");
	while(true) {
		DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
		
	//constructeur packet chez le client 2 parameters (receive) par contre chez le client 4 parameters(send)
	    socket.receive(packet);
		String username = new String(packet.getData(),0,packet.getLength());
		//getdata() : tableau of bytes
		String message ="bienvenue "+username;
		//message.getbyte() ou creer un datagrampacket puis lenvoyer 
		DatagramPacket msg = new DatagramPacket(message.getBytes(),message.length(),
				                                packet.getAddress(),packet.getPort());
		//4 parametres : tab de octets , longueur de message ou du tab , address du client , le port du client
		socket.send(msg);
	}
}
}
