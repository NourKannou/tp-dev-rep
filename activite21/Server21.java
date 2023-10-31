package activite21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server21 {
	public static void main(String[] args) {
        try {
           
            int port = 1234;
            ServerSocket s = new ServerSocket(port);
            System.out.println("Server is listening on port " + port);


            // Accept a client connection
            Socket ss = s.accept();
            System.out.println("Client connected " );

            // You can now handle the client's communication here.
            OutputStream os = ss.getOutputStream();
            InputStream is = ss.getInputStream();
            
            int op1 , op2 ;
            PrintWriter pw= new PrintWriter(os,true);
            InputStreamReader isr= new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            
           op1=Integer.parseInt(br.readLine());
           op2=Integer.parseInt(br.readLine());
            
            
           
            switch (br.readLine()){
            case "+" : pw.println(op1+op2);
            case "-": pw.println(op1-op2);
            case "/": pw.println(op1/op2);
            case "*": pw.println(op1*op2);
            }
            
            
            System.out.println(s);
            
            // Remember to close the client socket and server socket when done.
            ss.close();
            ss.close();
        } catch (IOException e) {
            // Handle exceptions here
            e.printStackTrace();
        }
    }
}
