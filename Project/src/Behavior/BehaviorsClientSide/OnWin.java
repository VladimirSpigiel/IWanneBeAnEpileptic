package Behavior.BehaviorsClientSide;

import kernel.Game;
import Controller.StateControllerPlaying;
import Model.Client;
import Model.Player;

public class OnWin extends BehaviorClient {

	public OnWin(Client c) {
		super(c, true);
	}

	@Override
	public void execute() {
		Player p = (Player) getObject();
		StateControllerPlaying state;
		if( Game.getInstance().peek() instanceof StateControllerPlaying){
			state = (StateControllerPlaying) Game.getInstance().peek();
			state.win(p);
			
		}
		
		
	}

}
