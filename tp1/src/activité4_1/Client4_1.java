package activité4_1;


	import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
	import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

	public class Client4_1 extends Thread{
		String nom , prenom;

		  public static void main(String[] args) throws UnknownHostException, IOException {
			  Socket ss = new Socket("localhost", 1234);
	            System.out.println("Client wait to be connected " );
	            OutputStream os = ss.getOutputStream();
	            InputStream is = ss.getInputStream();
			   
	            InputStreamReader isr = new InputStreamReader(is);
	            BufferedReader br =new BufferedReader(isr);
	            PrintWriter pw =new PrintWriter(os,true);
			    
	            Scanner scanner = new Scanner(System.in);
	            System.out.println("Saisissez votre nom : ");
	            String n =scanner.nextLine();
	            System.out.println("Saisissez votre prénom : ");
	            String p =scanner.nextLine();

	            pw.println(n+" "+p);
	            System.out.println("message du serveur:" +br.readLine());
	            ss.close();
	           

	            
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
		  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}