package laboratorio;

public interface StrategyRobo {
	void onScannedRobot(DiazTodino laboRobo);
	void onHitByBullet(DiazTodino laboRobo);
	void onHitWall(DiazTodino laboRobo);
	void run(DiazTodino laboRobo);
}
