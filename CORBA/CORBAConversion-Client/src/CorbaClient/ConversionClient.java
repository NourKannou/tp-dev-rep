// Package declaration for the CorbaClient
package CorbaClient;

// Import statements for necessary classes and interfaces
import corbaConversion.IConversionRemote;
import corbaConversion.IConversionRemoteHelper;
import org.omg.CORBA.Object;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

// Class representing the CORBA client for conversion
public class ConversionClient {
    // Main method, the entry point of the program
    public static void main(String[] args) throws NamingException {
        // Create an initial context for JNDI (Java Naming and Directory Interface)
        Context cntx = new InitialContext();

        // Perform a JNDI lookup to obtain the remote object reference
        java.lang.Object ref = cntx.lookup("OD");

        // Narrow the obtained object reference to the specific CORBA interface
        // (IConversionRemote)
        IConversionRemote stub = IConversionRemoteHelper.narrow((org.omg.CORBA.Object) ref);

        // Invoke the conversionMontant method on the remote object and print the result
        System.out.println(stub.conversionMontant(70.22));

        // Invoke the conversionMontant method with a different value and print the result
        System.out.println(stub.conversionMontant(50.14));
    }
}
