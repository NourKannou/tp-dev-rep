package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implémentation de l'interface distante IConversion
public class ConversionImpl extends UnicastRemoteObject implements IConversion {

    // Constructeur par défaut
    public ConversionImpl() throws RemoteException {
        super();
        // Appelle le constructeur de la classe mère (UnicastRemoteObject)
        // pour initialiser les fonctionnalités de communication distante
    }

    // Implémentation de la méthode distante convertirMontant
    public double convertirMontant(double mt) throws RemoteException {
      
    	// Effectue la conversion en multipliant le montant par un facteur (3.3 dans cet exemple)
        return mt * 3.3;
    }
}
