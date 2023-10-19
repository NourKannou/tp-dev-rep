package thread;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client22 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    char op=0;
  		 int op1,op2=0;
         
			        try {
			            Socket socket = new Socket("localhost", 12345); // Adresse IP et port du serveur

 // Créer l'objet Operation et l'envoyer au serveur
			        
			            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			            out.writeObject(new Operation(op, op2, op2));

 // Recevoir le résultat du serveur
			            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
			            Operation resultOperation = (Operation) in.readObject();

			            System.out.println("Résultat : " + resultOperation.getRes());
			           //System.out.println("Résultat : " + ((new ObjectInputStream(socket.getInputStream()).readObject()).getres());

 // Fermer les flux et la socket
			            out.close();
			            in.close();
			            socket.close();
			        } catch (Exception  e) {
			            e.printStackTrace();
			        }
			    }
			}
			//Assurez-vous de modifier l'adresse IP et le port en fonction de votre configuration réseau. Cette est un exemple simple qui ne gère que l'addition et la soustraction. Vous pouvez étendre ce modèle pour prendre en charge d'autres opérations mathématiques et ajouter des mécanismes de gestion des erreurs.







	


