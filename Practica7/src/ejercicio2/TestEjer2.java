package ejercicio2;

public class TestEjer2 {
	
	@SuppressWarnings("finally")
	public int unMetodo(){
		 try {
		System.out.println("Va a retornar 1");
		return 1;
		 } finally {
		System.out.println("Va a retornar 2");
		return 2;
		 }
		}
	
		public static void main(String[] args) {
		TestEjer2 res = new TestEjer2();
		System.out.println(res.unMetodo());
		}

		
		//java no permite la compilacion a codigo que es imposible de alcanzar
		
		//siempre retorna 2 auque tenga otra clausula de return, antes de entregarle el control al main este sobrescribe la salida con
		//el return del finaly
}
