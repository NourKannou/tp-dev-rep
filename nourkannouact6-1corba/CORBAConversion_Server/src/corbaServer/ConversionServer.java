package corbaServer;

import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;
import sevice.ConversionImpl;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ConversionServer {
    public static void main(String[] args) throws NamingException, InvalidName, AdapterInactive, WrongPolicy, ServantNotActive {
        //a.Initialize the ORB
        ORB orb = ORB.init(args,null);
        //c. Obtain the RootPOA and activate the POA manager
        Context ctxt = new InitialContext();
        POA poa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
        poa.the_POAManager().activate();
        //d. Create a ConversionImpl object, bind it to the naming service, and run the ORB
        ConversionImpl od = new ConversionImpl();
        ctxt.rebind("od",poa.servant_to_reference(od));
        orb.run();

    }


}
