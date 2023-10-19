package tp2;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;


public class Client11 {


    public static void main(String[] args) {
        try {
            
            System.out.println("Client wait to be connected " );
            
            InetAddress ia = InetAddress.getByName("10.26.12.52");
            InetSocketAddress isa = new InetSocketAddress(ia,1234);
            Socket ss = new Socket();
            ss.connect(isa);
            
            
            
            ss.close();
        } catch (Exception e) {
            // Handle exceptions here
            e.printStackTrace();
        }
    }
}
