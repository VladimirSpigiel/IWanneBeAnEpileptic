package Behavior.BehaviorsServerSide;

import Model.Player;
import Model.Server;

public class OnPlayer extends BehaviorServer {

	
	public OnPlayer(Server s) {
		super(s, true);
	}	
	

	@Override
	public void execute() {		
		server.getPlayerList().replace((Player) getObject());
		server.broadcast("players", server.getPlayerList());
		
		
	}

}
