package clients;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import ejercicio3.Servidor;

public class ClientContenedor {

	public static void main(String[] args) throws UnknownHostException, IOException {
		int number;
		Socket s = new Socket("127.0.0.1", 1342);
		Scanner sc1 = new Scanner(s.getInputStream());
		
		System.out.println("Enviando Numero");
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(2);
		
		s.close();
	}

}
