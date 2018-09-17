package musical;


import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ListenForSlider {

	protected static ChangeListener sliderListenerTime(Composer frame){
		return new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent event) {
			   if (!frame.sliderNote.getValueIsAdjusting()) {
				   frame.updateNote();
			    }
			}

			
		};
	}
	
}
