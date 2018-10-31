package ejercicio2;

public class TestSynchronized extends Thread {

	private String[] frase = {"Francia","en","los","diarios","de","mi","vejez"};
	
	public TestSynchronized(String id){
		super(id);
	}
	
	public void run(){
		synchronized(System.out){
			for(int i = 0; i < frase.length; i++){
				System.out.println(this.getName() + ": " + frase[i]+ "\n");
			}
		}
	}
	
	public static void main(String[] args) {
		
		TestSynchronized t1 = new TestSynchronized("Thread 1");
		TestSynchronized t2 = new TestSynchronized("Thread 2");
		TestSynchronized t3 = new TestSynchronized("Thread 3");
		Testttt1 t5 = new Testttt1("Thread 5");
		t1.start();
		t5.start();
		t2.start();
		t3.start();
	}
	
	public static class Testttt1 extends Thread {

		private String[] frase = {"Francia","en","los","diarios","de","mi","vejez"};
		
		public Testttt1(String id){
			super(id);
		}
		
		public void run(){
//			synchronized(System.out){
				for(int i = 0; i < frase.length; i++){
					System.out.println(this.getName() + ": " + frase[i]+ "\n");
				}
//			}
		}
		

	}

}
