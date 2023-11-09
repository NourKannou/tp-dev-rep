package rmiServer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import rmiService.ConversionImpl;
import rmiService.IConversion;

public class ConversionServer {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		// TODO Auto-generated method stub
		
		//1ere etape reservation du port :
		LocateRegistry.createRegistry(1099);
		
		 // création d'un objet distant (skeleton) sans rebinding
	     ConversionImpl od = new ConversionImpl();
	     System.out.print(od.toString());
	  // rebinding de l'objet distant dans le registre RMI
	     Naming.rebind("rmi://localhost:1099/conversionObject", od);
	
	     // côté client : la méthode naming.lookup récupérera le stub pour l'objet distant
    
	     // fel client naming.lookup troddou stub 
		
	}

}
