package Behavior.BehaviorsClientSide;

import kernel.Game;
import Model.Client;
import Model.Player;

public class OnPlayer extends BehaviorClient {

	public OnPlayer(Client c) {
		super(c, true);
	}

	@Override
	public void execute() {
		Player p = (Player) getObject();
		Game.getInstance().getPlayers().replace(p);
		
	}
	
	

}
