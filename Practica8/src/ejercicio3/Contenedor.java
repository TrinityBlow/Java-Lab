package ejercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import ejercicio2.Archivo;

public class Contenedor {
	
	public static void servidor() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, IOException{
		
		Class<?> classHelloWorld = ejercicio3.HelloWorld.class;
		Invocar aInvocar;
        File file;
        String eol = System.lineSeparator(), contenido = "", nombreArchivo;       
        BufferedWriter out = null;
        FileWriter writer = null;
        Servidor archivo = classHelloWorld.getAnnotation(Servidor.class);
        if(archivo != null && !archivo.archivo().equals("")){
        	nombreArchivo = archivo.archivo();
        } else{
        	nombreArchivo = "log.txt";
        }
		
        InetAddress addr = InetAddress.getByName(archivo.direccion());
        InetAddress addr2 = InetAddress.getByName("127.0.0.1");
        int port = Integer.parseInt(archivo.puerto());
        System.out.println(addr + "|||" + port);
        
        ServerSocket serverSocket  = new ServerSocket(9999,0,addr2);
        Socket clientSocket = serverSocket.accept();
        System.out.println("asd");
        
        
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
//        Date date = new Date();  
//        System.out.println(formatter.format(date));  
//        
//		try {
//        	writer = new FileWriter(nombreArchivo, true);
//            out = new BufferedWriter(writer);
//            out.write(contenido);
//        } catch (IOException e) {
//            file = new File(nombreArchivo);
//            writer = new FileWriter(file);
//            writer.write(contenido);
//        } finally {
//            if(out != null) {
//                out.close();
//            }
//            if(writer != null){
//            	writer.close();
//            }
//        }
//		
//        for (Method m : classHelloWorld.getDeclaredMethods()){
//			aInvocar = m.getAnnotation(Invocar.class);
//			if(aInvocar != null){
//				m.setAccessible(true);
//				m.invoke(classHelloWorld.newInstance(), new Object[0]);
//			}
//		}
		
	}
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, IOException{
//		servidor();
		int number;
		Scanner sc;
        ServerSocket serverSocket  = new ServerSocket(1342);
        System.out.println("Esperando Respuesta");
        Socket socket = serverSocket.accept();
        while (true){
            sc = new Scanner(socket.getInputStream());
        	number = sc.nextInt();
            System.out.println("mensaje");
        	sc.close();
        	serverSocket.accept();
        }
        
        
	}
}
