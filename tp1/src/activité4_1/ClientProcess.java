package activité4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientProcess {
Socket socket;
int ord =1 ;
public ClientProcess(Socket socket, int ord) {
	super();
	this.socket = socket;
	this.ord = ord;
}
public void run() throws IOException {
	 OutputStream os = socket.getOutputStream();
     InputStream is = socket.getInputStream();
     
     PrintWriter pw= new PrintWriter(os,true);
     InputStreamReader isr= new InputStreamReader(is);
     BufferedReader br = new BufferedReader(isr);
 
     pw.println("bienvenue"+br.readLine());





}
}

