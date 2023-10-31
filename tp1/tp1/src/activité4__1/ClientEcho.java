package activité4__1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEcho {
	private static final int port=1235;
	private static byte[] buffer = new byte[1024];
	public static void main(String[] args) throws SocketException, IOException {
		// TODO Auto-generated method stub
		DatagramSocket socket = new DatagramSocket();
		Scanner scanner = new Scanner(System.in);
		System.out.println("donner votre nom et prenom");
		String username = scanner.nextLine();
		DatagramPacket tosend = new DatagramPacket(username.getBytes(),username.length(),
				                                  InetAddress.getByName("localhost"),port);
				//from String to byte = getbyte()
				//from byte to  String = getdata()
				//3eme parametre donner ladresse du ce client avec la methode inet
	
		socket.send(tosend);
		DatagramPacket toreceive = new DatagramPacket(buffer,buffer.length);
		socket.receive(toreceive);
		System.out.println("server:"+
		                   new String(toreceive.getData(),0,toreceive.getLength()));
		

	}

}
