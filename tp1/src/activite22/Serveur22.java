package activite22;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   
	        try {
	            ServerSocket serverSocket = new ServerSocket(12345); // Port d'écoute

	            System.out.println("Serveur en attente de connexions...");
	            Socket clientSocket = serverSocket.accept();

// Code pour recevoir et traiter l'objet Operation du client
	            
	            ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
	            Operation operation = (Operation) in.readObject();
             //Operation operation = (Operation) (new ObjectInputStream(clientSocket.getInputStream()).readObject());
 
 // Faire le calcul en fonction de l'opération demandée
	          switch(operation.getOp()) {
	          case '+':operation.setRes(operation.getOp1()+operation.getOp2());
	          case '-':operation.setRes(operation.getOp1()-operation.getOp2());
	          case '*':operation.setRes(operation.getOp1()*operation.getOp2());
	          case '/':operation.setRes(operation.getOp1()/operation.getOp2());

	          }

 // Envoyer le résultat au client
	            ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
	            
	            out.writeObject(operation);

 // Fermer les flux et les sockets
	            in.close();
	            out.close();
	            clientSocket.close();
	            serverSocket.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	

	}


