package musical;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenForComboBox {

	protected static ActionListener changeInstruments(Composer frame){
		return new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event) {
				frame.updateInstrument();
			}
			
		};
	}
}
