package musical;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenForButton {
	

	protected static ActionListener buttonPlay(Composer frame){
		return new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event) {
				frame.player.play("C D E F G A B");
				
			}


		};
	}

}
