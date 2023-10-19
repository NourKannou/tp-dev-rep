package activite13;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client13 {
	  public static void main(String[] args) {
	        try {
	            Socket ss = new Socket("localhost", 1234);
	            System.out.println("Client wait to be connected " );
	            
	            OutputStream os = ss.getOutputStream();
	            InputStream is = ss.getInputStream();
	            
	            System.out.println(" write an integer " );
	            
	            Scanner scanner = new Scanner(System.in);
	           
	            int nb = scanner.nextInt();
	            int x = scanner.nextInt();
	            os.write(nb);
	            os.write(x);
	            
	            int rep = is.read();
	            
	            System.out.println("jai recu le resultat"+rep);
	            
	            os.close();
	            is.close();
	            ss.close();
	        } catch (Exception e) {
	            // Handle exceptions here
	            e.printStackTrace();
	        }
}}
