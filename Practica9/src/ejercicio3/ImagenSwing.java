package ejercicio3;

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

	private Corredor panel1,panel2,panel3,panel4,panel5;
	
	public ImagenSwing(){
		
		setTitle("Imagen Intermitente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1196, 744);
		setResizable(false);
		getContentPane().setLayout(null);
		
		panel1 = new Corredor("1",20);
		panel1.setBounds(12, 24, 300, 260);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		panel2 = new Corredor("2",20);
		panel2.setBounds(12, 24, 300, 260);
		getContentPane().add(panel2);
		panel2.setLayout(null);

		panel3 = new Corredor("3",20);
		panel3.setBounds(12, 24, 300, 260);
		getContentPane().add(panel3);
		panel3.setLayout(null);

		panel4 = new Corredor("4",20);
		panel4.setBounds(12, 24, 300, 260);
		getContentPane().add(panel4);
		panel4.setLayout(null);

		panel5 = new Corredor("5",20);
		panel5.setBounds(12, 24, 300, 260);
		getContentPane().add(panel5);
		panel5.setLayout(null);
		
//		ExecutorService exec = Executors.newSingleThreadExecutor();
//		exec.execute(new ThreadToggleImage(this));
//		exec.shutdown();
	}
	
//	public void toggleImage(){
//		panel.toggle();
//		panel.setBorder(new TitledBorder(null, "Imagen", TitledBorder.LEADING, TitledBorder.TOP, null, null));
//	}
	
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
