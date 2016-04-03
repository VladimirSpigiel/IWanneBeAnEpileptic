package Behavior.BehaviorsClientSide;

import kernel.Game;
import Controller.StateControllerPlaying;
import Model.Client;

public class OnNewRound extends BehaviorClient {

	public OnNewRound(Client c) {
		super(c, false);
	}

	@Override
	public void execute() {
		StateControllerPlaying state;
		
		if(Game.getInstance().peek() instanceof StateControllerPlaying){
			 state = (StateControllerPlaying) Game.getInstance().peek();
			 state.endOfRound(false);
		}
	}
	
	

}
