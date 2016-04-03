package Behavior.BehaviorsClientSide;

import kernel.Game;
import Model.Client;
import Model.PlayerList;

public class OnPlayers extends BehaviorClient {

	public OnPlayers(Client c) {
		super(c, true);
	}

	@Override
	public void execute() {
		
		PlayerList p = (PlayerList) getObject();
		Game.getInstance().setPlayers(p);
		
	}

}
