package ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ListenForPanel {

		public static ActionListener partituraListener(Corredor panel){
			return new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					panel.toggle();
				}

			};
		}
}
