package tp2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client21 {
	public static void main(String[] args) {
       int op1, op2;
       String operation;
		try {
            Socket ss = new Socket("localhost", 1234);
            System.out.println("Client wait to be connected " );
            
            OutputStream os = ss.getOutputStream();
            InputStream is = ss.getInputStream();
            
            //scanner pour lire op1 op2 operateur
            
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String oper =scanner.nextLine();
            
            PrintWriter pw = new PrintWriter(os,true);
            pw.println("a");
            pw.println("b");
            do {
            pw.println("oper");
            } while(oper!= "+"  && oper != "-" && oper != "/" &&  oper != "*");
             InputStreamReader isr= new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            System.out.print(a+oper+b+ "="+ br.readLine());
            
          
            
            
            
            
            os.close();
            is.close();
            ss.close();
        } catch (Exception e) {
            // Handle exceptions here
            e.printStackTrace();
        }
    }
}
