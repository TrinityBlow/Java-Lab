package ejercicio3;

public class ThreadToggleImage implements Runnable {

	private ImagenSwing frame;
	
	public ThreadToggleImage(ImagenSwing frame){
		super();
		this.frame = frame;
	}
	
	@Override
	public void run() {
		while(true){
			sleep();
//			frame.toggleImage();
		}
	}

	private void sleep() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
