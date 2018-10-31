package musical;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ListenForPanel {

		public static MouseListener partituraListener(Composer frame){
			return new MouseListener(){

				@Override
				public void mouseClicked(MouseEvent event) {
					int clickY = (int) event.getPoint().getY();
					if( (clickY >= 35) && (clickY < 45) ){
						frame.nextTune(40);
					}else if( (clickY >= 45) && (clickY < 55) ){
						frame.nextTune(50);
					}else if( (clickY >= 55) && (clickY < 65) ){
						frame.nextTune(60);
					}else if( (clickY >= 65) && (clickY < 75) ){
						frame.nextTune(70);
					}else if( (clickY >= 75) && (clickY < 85) ){
						frame.nextTune(80);
					}else if( (clickY >= 85) && (clickY < 95) ){
						frame.nextTune(90);
					}else if( (clickY >= 95) && (clickY < 105) ){
						frame.nextTune(100);
					}else if( (clickY >= 105) && (clickY < 115) ){
						frame.nextTune(110);
					}else if( (clickY >= 115) && (clickY < 125) ){
						frame.nextTune(120);
					}else if( (clickY >= 125) && (clickY < 135) ){
						frame.nextTune(130);
					}else if( (clickY >= 135) && (clickY < 145) ){
						frame.nextTune(140);
					}else if( (clickY >= 145) && (clickY < 155) ){
						frame.nextTune(150);
					}else if( (clickY >= 155) && (clickY < 165) ){
						frame.nextTune(160);
					}	
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			};
		}
}
