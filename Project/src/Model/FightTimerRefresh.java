package Model;

public class FightTimerRefresh extends FightTimerTask {
	
	
	
	public FightTimerRefresh(Fight f) {
		super(f);
	}

	@Override
	public void run() {
		
		
		fight.server.broadcast("timer", fight.timer);		
		
		if(fight.timer <= 0){
			fight.timesUp();
		}
		fight.timer--;
	
			
	}
	

}
