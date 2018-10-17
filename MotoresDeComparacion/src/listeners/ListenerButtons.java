package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import motores.ComparacionL;

public class ListenerButtons {

	public static ActionListener buttonComp(JFileChooser chooser,JTextArea text, JTextArea viewText){
		return new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event) {
				ArrayList<String> qgrama = new ArrayList<String>();
				ArrayList<String> cadenaList = new ArrayList<String>();
				List<String> cadena = Arrays.asList(text.getText().split(" "));
				int x;
				ComparacionL comp = new ComparacionL();
				File  fr = null;
				BufferedReader br = null;
				String st;
				
				try {
					fr = new File(chooser.getSelectedFile().getPath());
					br = new BufferedReader(new FileReader(fr)); 
					while ((st = br.readLine()) != null) {
						    if(st.length() > 0){
						    	cadenaList.add(st);
						    }
					} 
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				


				
				for (String palabra: cadena) {
					if(palabra.length() > 3){
						palabra = "#" + palabra + "$";
						for(x = 0; x < palabra.length() - 1; x++){
							qgrama.add(palabra.substring(x, x+2));
						}
					}
			    }
				
				for (String palabra: cadena) {
					if(palabra.length() > 3){
						cadenaList.add(palabra);
					}
			    }
				

				System.out.println(cadenaList.toString());
				System.out.println(qgrama.toString());
				comp.comparaciones(qgrama, cadena);
				
				viewText.setText(qgrama.toString());
			}
		};
	}

	public static ActionListener buttonChoseFile(JFrame frame, JFileChooser chooser){
		return new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event) {
	            chooser.showOpenDialog(frame);
			}
		};
	}
}
