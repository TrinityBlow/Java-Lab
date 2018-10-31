package ejercicio1;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.border.TitledBorder;


public class ImagenSwing extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JImagen panel;
	private BufferedImage paisaje;
	
	public ImagenSwing(){
		
		this.buscarImagen();
		setTitle("Imagen Intermitente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1196, 744);
		setResizable(false);
		getContentPane().setLayout(null);
		
		panel = new JImagen(paisaje);
		panel.setBounds(12, 24, 300, 260);
		panel.setBorder(new TitledBorder(null, "Imagen", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		ExecutorService exec = Executors.newSingleThreadExecutor();
		exec.execute(new ThreadToggleImage(this));
		exec.shutdown();
	}

	private void buscarImagen() {		
		try {
			String sep = File.separator;
			paisaje = ImageIO.read(new File("." + sep + "resources" + sep + "ima.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	
	public void toggleImage(){
		panel.toggle();
		panel.setBorder(new TitledBorder(null, "Imagen", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	}
	
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImagenSwing frame = new ImagenSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
