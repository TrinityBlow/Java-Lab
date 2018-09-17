package musical;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.jfugue.player.Player;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

public class Composer extends JFrame {
	
	protected Box theBox;
	protected Box boxCompositor,boxCompositorPart1,boxCompositorPart2, boxTexto;
	protected Box noteBox,note1,note2,note3,note4,note5,note6,note7;
	protected JTextField text1,text2;
	protected JButton button1, button2;
	protected JSlider sliderNote, sliderTune;
	protected Player player;
	protected BufferedImage picRedonda, picBlanca, picNegra, picCorchea, picSemicorchea, picFusa, picSemifusa, picClaveSol;
	protected Hashtable<Integer, JLabel> labelTune, labelNote;
	protected JPartitura partitura;
	
	private static final long serialVersionUID = 1L;
	
	public Composer(){
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		theBox = Box.createVerticalBox();
		player = new Player();
		this.buscarImagenes();
		this.add(theBox);
		this.initializeCompositor();
		this.initializeTextoNota();
	//	this.initializeListener();
		
		this.setSize(800, 300);
		this.setVisible(true);;
	}
	
	private void buscarImagenes() {		
		try {
			picRedonda = ImageIO.read(new File(".\\resources\\redonda.png"));
			picBlanca = ImageIO.read(new File(".\\resources\\blanca.png"));
			picNegra = ImageIO.read(new File(".\\resources\\negra.png"));
			picCorchea = ImageIO.read(new File(".\\resources\\corchea.png"));
			picSemicorchea = ImageIO.read(new File(".\\resources\\semicorchea.png"));
			picFusa = ImageIO.read(new File(".\\resources\\fusa.png"));
			picSemifusa = ImageIO.read(new File(".\\resources\\semifusa.png"));
			picClaveSol = ImageIO.read(new File(".\\resources\\clavesol.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

	private void initializeListener() {
		//listeners de componentes
		ChangeListener lForSlider = ListenForSlider.sliderListenerTime(this);
		ActionListener lButtons = ListenForButton.buttonPlay(this);
		sliderNote.addChangeListener(lForSlider);
		button1.addActionListener(lButtons);
		button2.addActionListener(lButtons);
		
	}

private void initializeCompositor() {
		boxCompositorPart1 = Box.createVerticalBox();
		boxCompositorPart2 = Box.createVerticalBox();
		//this.createTuneBox();
		partitura = new JPartitura(picClaveSol);
		boxCompositorPart1.add(partitura);
		this.createNoteBox();	
		
		//creacion de componentes
		boxCompositor = Box.createHorizontalBox();
		button1 = new JButton("Presione");
		text1 = new JTextField("");
		text1.setMaximumSize( new Dimension( 400, 48 ) );
		
		//agregacion de componentes al panel
		boxCompositorPart1.add(text1);
		boxCompositorPart2.add(button1);
		boxCompositor.add(boxCompositorPart1);
		boxCompositor.add(boxCompositorPart2);

		//agrega panel al panel del frame
		theBox.add(boxCompositor);
		
	}

	private void createNoteBox() {
		labelNote = new Hashtable<Integer, JLabel>();
		sliderNote = new JSlider(1, 7, 3);
		sliderNote.setMajorTickSpacing(1);
		sliderNote.setPaintTicks(true);
		
		//label con los tonos
		labelNote.put( new Integer( 1 ), new JLabel(new ImageIcon(picRedonda)) );
		labelNote.put( new Integer( 2 ), new JLabel(new ImageIcon(picBlanca)) );
		labelNote.put( new Integer( 3 ), new JLabel(new ImageIcon(picNegra)) );
		labelNote.put( new Integer( 4 ), new JLabel(new ImageIcon(picCorchea)) );
		labelNote.put( new Integer( 5 ), new JLabel(new ImageIcon(picSemicorchea)) );
		labelNote.put( new Integer( 6 ), new JLabel(new ImageIcon(picFusa)) );
		labelNote.put( new Integer( 7 ), new JLabel(new ImageIcon(picSemifusa)) );
		sliderNote.setLabelTable( labelNote );
		
		sliderNote.setPaintLabels(true);	
		boxCompositorPart2.add(sliderNote);
	}

	private void initializeTextoNota() {
		boxTexto = Box.createHorizontalBox();
		button2 = new JButton("Presione");
		text2 = new JTextField("",10);

		text2.setMaximumSize( new Dimension( this.getMaximumSize().width, 40 ) );
		boxTexto.add(text2);
		boxTexto.add(button2);
		
		theBox.add(boxTexto);
	}



	public static void main(String[] args) {
		new Composer();
	}

}
