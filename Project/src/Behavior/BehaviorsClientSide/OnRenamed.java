package Behavior.BehaviorsClientSide;

import kernel.Game;
import Model.Client;
import Model.Player;

public class OnRenamed extends BehaviorClient {

	public OnRenamed(Client c) {
		super(c, true);
	}

	@Override
	public void execute() {
		Player p = (Player) getObject();
		Game.getInstance().getPlayer().setPseudo(p.getPseudo());
		
	}

}