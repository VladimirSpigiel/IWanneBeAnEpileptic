package Behavior.BehaviorsClientSide;

import kernel.Game;
import Controller.StateControllerPlaying;
import Model.Client;

public class OnTimer extends BehaviorClient {

	public OnTimer(Client c) {
		super(c, true);
	}

	@Override
	public void execute() {
		
		StateControllerPlaying state;
		int timer = (int) getObject();
		
		if( Game.getInstance().peek() instanceof StateControllerPlaying){
			state = (StateControllerPlaying) Game.getInstance().peek();
			state.timerUpdate(timer);
		}
		
	}

}
