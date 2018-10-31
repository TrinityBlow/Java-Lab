package musical;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeListener;
import org.jfugue.player.Player;


import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

public class Composer extends JFrame {
	
	protected Box theBox;
	protected Box boxCompositor,boxCompositorPart1,boxCompositorPart2, boxTexto;
	protected Box noteBox,signoBox, buttonCompBox;
	protected JTextArea text1,text2;
	protected JButton buttonComp1,buttonComp2,buttonComp3, button2;
	protected JSlider sliderNote;
	protected Player player;
	protected BufferedImage picRedonda, picBlanca, picNegra, picCorchea, picSemicorchea, picFusa, picSemifusa, picClaveSol;
	protected Hashtable<Integer, JLabel>  labelNote;
	protected Hashtable<Character, BufferedImage>  charToPic;
	protected JPartitura partitura;
	protected Character actualNote = 'q';
	protected String signo = "", actualInstrument = "PIANO";
	protected JRadioButton signoSostenido, signoNinguno;
    protected ButtonGroup group;
	protected JComboBox<String> menuInst;
	protected String instruments[];
	protected String[] jfugueInst;
	protected JScrollPane scrollText1,scrollText2;
	
	private static final long serialVersionUID = 1L;
	
	public Composer(){
		//configuracion de la box maestra y del frame
		theBox = Box.createVerticalBox();
		player = new Player();
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.buscarImagenes();
		this.add(theBox);
		this.setSize(1200, 300);
		
		//composicion del Compositor Musical
		this.initializeCompositor();
		//composicion del Compositor por Escritura JFugue
		this.initializeTextoNota();
		//listeners
		this.initializeListener();

		//mostrar frame
		this.setVisible(true);
	}
	
	
	//buscar las imagenes en la carpeta resource y la translada a un hashmap por character
	private void buscarImagenes() {		
		try {
			String sep = File.separator;
			picRedonda = ImageIO.read(new File("." + sep + "resources" + sep + "redonda.png"));
			picBlanca = ImageIO.read(new File("." + sep + "resources" + sep + "blanca.png"));
			picNegra = ImageIO.read(new File("." + sep + "resources" + sep + "negra.png"));
			picCorchea = ImageIO.read(new File("." + sep + "resources" + sep + "corchea.png"));
			picSemicorchea = ImageIO.read(new File("." + sep + "resources" + sep + "semicorchea.png"));
			picFusa = ImageIO.read(new File("." + sep + "resources" + sep + "fusa.png"));
			picSemifusa = ImageIO.read(new File("." + sep + "resources" + sep + "semifusa.png"));
			picClaveSol = ImageIO.read(new File("." + sep + "resources" + sep + "clavesol.png"));
			charToPic = new Hashtable<Character, BufferedImage>();
			charToPic.put( new Character('w'), picRedonda );
			charToPic.put( new Character('h'), picBlanca );
			charToPic.put( new Character('q'), picNegra );
			charToPic.put( new Character('i'), picCorchea );
			charToPic.put( new Character('s'), picSemicorchea );
			charToPic.put( new Character('t'), picFusa );
			charToPic.put( new Character('x'), picSemifusa );
			charToPic.put( new Character('n'), picClaveSol );
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

	//listeners de todos los componentes
	private void initializeListener() {
		ActionListener lRadioButton = ListenForRadioButton.changeSigno(this);
		ChangeListener lForSlider = ListenForSlider.sliderListenerTime(this);
		
		sliderNote.addChangeListener(lForSlider);
		buttonComp1.addActionListener(ListenForButton.buttonCompPlay(this));
		buttonComp2.addActionListener(ListenForButton.buttonCompDeshacer(this));
		buttonComp3.addActionListener(ListenForButton.buttonCompLimpiar(this));
		signoNinguno.addActionListener(lRadioButton);
		signoSostenido.addActionListener(lRadioButton);
		button2.addActionListener(ListenForButton.buttonStringPlay(this));
		menuInst.addActionListener(ListenForComboBox.changeInstruments(this));
		partitura.addMouseListener(ListenForPanel.partituraListener(this));
	}

	//creacion de componentes del Compositor Musical
	private void initializeCompositorBox(){
		boxCompositorPart1 = Box.createVerticalBox();
		boxCompositorPart2 = Box.createVerticalBox();
		partitura = new JPartitura(picClaveSol,charToPic);
		boxCompositor = Box.createHorizontalBox();
		buttonComp1 = new JButton("Tocar");
		buttonComp2 = new JButton("Deshacer");
		buttonComp3 = new JButton("Limpiar");
		buttonCompBox = Box.createHorizontalBox();
		signoNinguno = new JRadioButton("Ninguno");
		signoSostenido = new JRadioButton("#");
		signoBox = Box.createHorizontalBox();
		text1 = new JTextArea(20,12);
		scrollText1 = new JScrollPane(text1);
		text1.setEditable(false);
		text1.setLineWrap(true);
		scrollText1.setPreferredSize(new Dimension(40,40));
		scrollText1.setMaximumSize(new Dimension(this.getWidth(),80));
	}
	

	
	
	//agregacion de todos los componentes creados en el box y paneles pertenecientes al Compositor Musical
	//el orden importa para la ubicacion en el layout
	private void addComponentsToPanel(){
		theBox.add(new JLabel("Compositor Musical"));
		
		boxCompositorPart1.add(partitura);
		partitura.setPreferredSize(new Dimension(300,200));
		boxCompositorPart1.add(scrollText1);
		signoBox.add(signoNinguno);
		signoBox.add(signoSostenido);
		boxCompositorPart2.add(signoBox);
		boxCompositorPart2.add(sliderNote);
		buttonCompBox.add(buttonComp1);
		buttonCompBox.add(buttonComp2);
		buttonCompBox.add(buttonComp3);
		boxCompositorPart2.add(buttonCompBox);
		boxCompositorPart2.add(menuInst);
		boxCompositor.add(boxCompositorPart1);
		boxCompositor.add(boxCompositorPart2);
		theBox.add(boxCompositor);

	}
	

	private void initializeCompositor() {
		//creacion de los componentes con su configuracion
		this.initializeCompositorBox();
		this.initializeRadioButton();
		this.createNoteBox();	
		this.menuInstruments();
		
		//agregacion de los componentes al frame
		this.addComponentsToPanel();
	}


	//instrumentos usados por el jfugue
	private void menuInstruments(){
		instruments =  new String[]{"PIANO", "ELECTRIC PIANO", "VIOLIN", "DRAWBAR ORGAN", "GUITAR", "STEEL STRING GUITAR", "ELECTRIC CLEAN GUITAR", "FLUTE"};
		jfugueInst = new String[]{"PIANO", "ELECTRIC_PIANO", "VIOLIN", "DRAWBAR_ORGAN", "GUITAR", "STEEL_STRING_GUITAR", "ELECTRIC_CLEAN_GUITAR", "FLUTE"};
		menuInst = new JComboBox<String>(instruments);
		menuInst.setMaximumSize( new Dimension( 800, 30 ) );
	}
	
	//grupo de radio button que controla el signo
	private void initializeRadioButton(){
		signoSostenido.setVerticalTextPosition(SwingConstants.TOP);
		signoSostenido.setHorizontalTextPosition(SwingConstants.CENTER);
		signoSostenido.setActionCommand("#");
		signoNinguno.setVerticalTextPosition(SwingConstants.TOP);
		signoNinguno.setHorizontalTextPosition(SwingConstants.CENTER);
		signoNinguno.setActionCommand("");
		group = new ButtonGroup();
		group.add(signoSostenido);
		group.add(signoNinguno);
		signoNinguno.setSelected(true);
	}

	//crea el slider de las notas con sus imagenes
	private void createNoteBox() {
		//creacion del label y el slider
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
	}

	//Crea el compositor por escritura JFugue
	private void initializeTextoNota() {
		theBox.add(new JLabel("Compositor por Escritura JFugue"));
		boxTexto = Box.createHorizontalBox();
		button2 = new JButton("Tocar Custom");
		text2 = new JTextArea(5,12);		
		text2.setLineWrap(true);
		scrollText2 = new JScrollPane(text2);
		scrollText2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollText2.setPreferredSize(new Dimension(80,60));
		scrollText2.setMaximumSize(new Dimension(this.getWidth(),60));
	    boxTexto.add(scrollText2);
		boxTexto.add(button2);
	
		theBox.add(boxTexto);
	}
	
	
	//activa el JFugue  con lo que hay en el text
	protected void playText1() {
		player.play("I[" + actualInstrument + "] " + text1.getText());
	}

	protected void playText2() {
		player.play( "I[" + actualInstrument +"] " + text2.getText());
	}
	
	//actualize la duracion de la nota con la que muestra el slider
	protected void updateNote() {
		if (sliderNote.getValue() == 1){
			actualNote = 'w';
		} else if(sliderNote.getValue() == 2){
			actualNote = 'h';
		} else if(sliderNote.getValue() == 3){
			actualNote = 'q';
		} else if(sliderNote.getValue() == 4){
			actualNote = 'i';
		} else if(sliderNote.getValue() == 5){
			actualNote = 's';
		} else if(sliderNote.getValue() == 6){
			actualNote = 't';
		} else {
			actualNote = 'x';
		} 
	}
	
	//modifica el texto correspondiente con la panel de la partitura
	private void updateText1(){
		text1.setText(this.partitura.getStringJFugue());
	}
	
	//dada una posicion en pixeles agrega la siguiente nota en el la partitura
	protected void nextTune(int position){
		this.partitura.nextTune(position, actualNote,signo);
		this.updateText1();
	}
	
	//borra las notas de la partitura
	protected void limpiarPartitura(){
		partitura.limpiar();
		this.updateText1();
	}

	//remueve la ultima nota de la partitura
	protected void removeLastTune(){
		partitura.removeLastTune();
		this.updateText1();
	}

	//modifica el signo correspondiente con el radio button seleccionado
	protected void updateSigno() {
		signo = group.getSelection().getActionCommand();
	}

	//modifica el instrumento actual correspondiente al elegido en el menu
	protected void updateInstrument() {
		actualInstrument = String.valueOf(jfugueInst[menuInst.getSelectedIndex()]);
	}
	
	
	public static void main(String[] args) {
		new Composer();
	}


}
