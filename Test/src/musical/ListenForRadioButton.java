package musical;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenForRadioButton {
	
	protected static ActionListener changeSigno(Composer frame){
		return new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event) {
				frame.updateSigno();	
			}
		};
	}
}
