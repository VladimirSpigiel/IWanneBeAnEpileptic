package Model;

public class FightTimerEndOfRound extends FightTimerTask {

	protected int timer;
	protected int delay;
	
	public FightTimerEndOfRound(Fight f, int delay) {
		super(f);
		this.delay = delay;
		
	}

	@Override
	public void run() {
		timer++;
		if(timer >= this.delay / 1000)
			fight.stopEndOfRound(); 	
		
			
	}

}
