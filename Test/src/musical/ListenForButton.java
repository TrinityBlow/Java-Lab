package musical;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenForButton {
	

	protected static ActionListener buttonCompPlay(Composer frame){
		return new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event) {
				frame.playText1();
				
			}
		};
	}

	protected static ActionListener buttonCompDeshacer(Composer frame){
		return new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event) {
				frame.removeLastTune();
				
			}
		};
	}
	
	protected static ActionListener buttonCompLimpiar(Composer frame){
		return new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event) {
				frame.limpiarPartitura();
				
			}
		};
	}
	
	protected static ActionListener buttonStringPlay(Composer frame){
		return new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event) {
				frame.playText2();
			}
		};
	}

	
}
