package ejercicio3;

@Servidor(archivo = "log.txt", direccion = "192.168.0.88", puerto = "4444")
public class HelloWorld {

	@Invocar
	public void test1(){
		System.out.println("Hello test1");
	}
	
	@Invocar
	public void test2(){
		System.out.println("Hellow test2");
	}
	
	
}
