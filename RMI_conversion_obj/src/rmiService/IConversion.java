package rmiService;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConversion extends Remote{
	// Signature de la méthode de conversion à implémenter
    // Elle prend en paramètre un montant et renvoie un résultat de type double
	double convertirMontant(double mt) throws RemoteException;

}
