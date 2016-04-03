package Behavior.BehaviorsClientSide;

import kernel.Game;
import Controller.StateControllerPlaying;
import Model.Client;

public class OnEndRound extends BehaviorClient {

	public OnEndRound(Client c) {
		super(c, false);
	}

	@Override
	public void execute() {
		StateControllerPlaying state;
		if( Game.getInstance().peek() instanceof StateControllerPlaying){
			state = (StateControllerPlaying) Game.getInstance().peek();
			client.send("acceptEndOfRound", null);
			state.endOfRound(true);
			
		}
	}
	
	
}