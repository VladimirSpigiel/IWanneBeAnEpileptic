package Model;

import java.util.TimerTask;

public abstract class FightTimerTask extends TimerTask {

	protected Fight fight;
	
	public FightTimerTask(Fight f) {
		fight = f;
	}
	
	
	
	

}
