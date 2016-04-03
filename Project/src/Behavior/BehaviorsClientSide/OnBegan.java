package Behavior.BehaviorsClientSide;

import utils.Formats;
import kernel.Game;
import Controller.StateControllerJoinGame;
import Controller.StateControllerPlaying;
import Model.Client;

public class OnBegan extends BehaviorClient {

	public OnBegan(Client c) {
		super(c, false);
	}

	@Override
	public void execute() {
		StateControllerJoinGame state;
		
		if(Game.getInstance().peek() instanceof StateControllerJoinGame){
			 state = (StateControllerJoinGame) Game.getInstance().peek();
			 state.getView().setData("erreurs", Formats.toByte("La partie a d�j� commenc� !"));
		}
	}

}
