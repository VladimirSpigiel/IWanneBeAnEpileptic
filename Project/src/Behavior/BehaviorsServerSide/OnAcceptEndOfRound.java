package Behavior.BehaviorsServerSide;

import Model.Server;

public class OnAcceptEndOfRound extends BehaviorServer {

	public OnAcceptEndOfRound(Server s) {
		super(s, false);
	}

	@Override
	public void execute() {
		server.getFight().setAcceptEndOfRound(server.getFight().getAcceptEndOfRound() + 1);		
	}

}
