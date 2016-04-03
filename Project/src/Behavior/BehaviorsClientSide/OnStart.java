package Behavior.BehaviorsClientSide;

import kernel.Game;
import Controller.StateControllerPlaying;
import Model.Client;

public class OnStart extends BehaviorClient {

	public OnStart(Client c) {
		super(c, false);
	}

	@Override
	public void execute() {
		Game.getInstance().push(new StateControllerPlaying(Game.getViewFactory().createViewPlaying()));
	}

}