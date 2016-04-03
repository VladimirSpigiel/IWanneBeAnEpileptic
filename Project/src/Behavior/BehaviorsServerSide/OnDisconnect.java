package Behavior.BehaviorsServerSide;

import Model.Player;
import Model.Server;

public class OnDisconnect extends BehaviorServer {

	public OnDisconnect(Server s) {
		super(s, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		Player p = (Player) getObject();
		server.getPlayerList().remove(p);
		server.broadcast("players", server.getPlayerList());
		
	}

}
