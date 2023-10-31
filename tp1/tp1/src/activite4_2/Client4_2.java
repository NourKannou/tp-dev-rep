package activite4_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client4_2 extends Thread{
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
    Socket s = new Socket("localhost",1234);
    
    InputStreamReader isr= new InputStreamReader(s.getInputStream());
    BufferedReader br = new BufferedReader(isr);
    PrintWriter pw = new PrintWriter (s.getOutputStream(),true);
	
    pw.println("quelle est la date ?");
    System.out.println("la date d'aujourd'hui est"+ br.readLine());
	
    s.close();
	}
}
