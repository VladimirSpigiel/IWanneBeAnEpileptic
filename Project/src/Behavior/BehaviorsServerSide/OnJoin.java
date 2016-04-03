package Behavior.BehaviorsServerSide;

import Model.Player;
import Model.Server;

public class OnJoin extends BehaviorServer {

	public OnJoin(Server s) {
		super(s, true);
	}

	@Override
	public void execute() {
		Player p = (Player) getObject();
		p.setAlive(true);
		server.getPlayerList().add(p);
		server.send("joined", null, getFrom());
		server.send("renamed", p, getFrom());
		
		server.broadcast("players", server.getPlayerList());		
	}
	
	

}
