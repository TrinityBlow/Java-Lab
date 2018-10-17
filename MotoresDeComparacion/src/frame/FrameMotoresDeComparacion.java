package frame;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;

import listeners.ListenerButtons;

public class FrameMotoresDeComparacion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton fc, fcText;
	private JPanel panel;
	private JTextArea areaText, viewText;
	private JLabel labelArea, labelViewText;
	private JScrollPane scrollText,scrollViewText;
	private JFileChooser chooser;
	
	
	public FrameMotoresDeComparacion(){
		
		setTitle("Buscador de Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 650);
		setResizable(false);
		setLocation(15, 0);
		getContentPane().setLayout(null);
		chooser = new JFileChooser();
		
		panel = new JPanel();
		panel.setBounds(12, 24, 400, 100);
		panel.setBorder(new TitledBorder(null, "Seleccionar Diccionario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		fc = new JButton();
		fc.setBounds(145, 60, 150, 30);
		fc.setText("Seleccionar Archivo");
		getContentPane().add(fc);
		fc.setLayout(null);
		
		labelArea = new JLabel("Ingresar Texto");
		labelArea.setBounds(275, 127, 127, 28);
		getContentPane().add(labelArea);		

		areaText = new JTextArea(5,12);	
		areaText.setLineWrap(true);
		scrollText = new JScrollPane(areaText);
		scrollText.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollText.setBounds(2, 150, 650, 170);
		getContentPane().add(scrollText);
		
		fcText = new JButton();
		fcText.setText("Buscar");
		fcText.setBounds(250, 350, 150, 30);
		getContentPane().add(fcText);
	
		labelViewText = new JLabel("Resultado de la Busqueda");
		labelViewText.setBounds(250, 400, 155, 28);
		getContentPane().add(labelViewText);	
		
		viewText = new JTextArea(5,12);	
		viewText.setLineWrap(true);
		viewText.setEditable(false);
		scrollViewText = new JScrollPane(viewText);
		scrollViewText.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollViewText.setBounds(2, 425, 650, 170);
		getContentPane().add(scrollViewText);

		fc.addActionListener(ListenerButtons.buttonChoseFile(this,chooser));
		fcText.addActionListener(ListenerButtons.buttonComp(chooser,areaText,viewText));
		
		areaText.setLayout(null);
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMotoresDeComparacion frame = new FrameMotoresDeComparacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
