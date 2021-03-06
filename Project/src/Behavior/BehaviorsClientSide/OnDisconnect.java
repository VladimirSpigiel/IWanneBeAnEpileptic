package Behavior.BehaviorsClientSide;

import kernel.Game;
import Controller.StateControllerDisconnected;
import Model.Client;

public class OnDisconnect extends BehaviorClient {

	public OnDisconnect(Client c) {
		super(c, false);
	}

	@Override
	public void execute() {
		if(! Game.getInstance().isHostApplication())
			Game.getInstance().push(new StateControllerDisconnected(Game.getViewFactory().createViewDisconnected()));
		
		client.setServerClosed(true);
		
		try {
			client.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
