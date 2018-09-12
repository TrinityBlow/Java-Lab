package laboratorio;

import java.util.Random;

public class Furious implements StrategyRobo {

	@Override
	public void run(DiazTodino laboRobo) {
		laboRobo.setColors(laboRobo.orange, laboRobo.blue, laboRobo.white, laboRobo.yellow, laboRobo.black);
		while(true) {
			Random r = new Random();
			int Low = 10;
			int High = 100;
			int Result = r.nextInt(High-Low) + Low;
			if(Result < 50){
				laboRobo.ahead(70);
				laboRobo.turnLeft(43);
			}else{
				laboRobo.ahead(100);
				laboRobo.turnRight(43);
			}

		}
	}

	@Override
	public void onScannedRobot(DiazTodino laboRobo) {
		if(laboRobo.scannedDistance < 80){
			laboRobo.fire(1);	
		}
	}

	@Override
	public void onHitByBullet(DiazTodino laboRobo) {
		laboRobo.back(10);
	}

	@Override
	public void onHitWall(DiazTodino laboRobo) {
		laboRobo.turnRight(110);
		laboRobo.ahead(200);
	}

}
