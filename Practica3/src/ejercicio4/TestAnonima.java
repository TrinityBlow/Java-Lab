package ejercicio4;



public class TestAnonima {

	
	public static void main(String[] args) {
		Object a = new Test().sa();
		System.out.println(a.toString());
		System.out.println(a instanceof Test);
	}

}
