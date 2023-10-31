
package activité4__2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client {


		private static final int port=1236;
		private static byte[] buffer = new byte[1024];
		public static void main(String[] args) throws SocketException, IOException {
			// TODO Auto-generated method stub
		
			DatagramSocket socket = new DatagramSocket();
			Scanner scanner = new Scanner(System.in);
			byte[] requestdata = new byte[1024];
//on fait un tab de bytes vide pour le parametre de packet (tosend) 
//le but: des que le client se connecte le server envoie l'heure
			
			DatagramPacket tosend = new DatagramPacket(requestdata,requestdata.length,
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


