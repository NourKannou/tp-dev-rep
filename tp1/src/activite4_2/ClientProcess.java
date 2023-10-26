package activite4_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientProcess {
Socket socket ;
int ord =1;

public ClientProcess(Socket socket, int ord) {
	super();
	this.socket = socket;
	this.ord = ord;
}
public void run() throws IOException {
InputStreamReader isr = new InputStreamReader(socket.getInputStream());
BufferedReader br = new BufferedReader(isr);
PrintWriter pw = new PrintWriter(socket.getOutputStream());

//br.readline;

String date ="2023/10/26/17:19";
pw.println(date);
socket.close();


}
}
