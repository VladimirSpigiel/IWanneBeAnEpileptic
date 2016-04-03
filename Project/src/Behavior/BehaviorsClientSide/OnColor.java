package Behavior.BehaviorsClientSide;

import kernel.Game;
import Model.Client;
import Model.Color;

public class OnColor extends BehaviorClient {

	public OnColor(Client c) {
		super(c, true);
	}

	@Override
	public void execute() {
		Color c = (Color) getObject();
		Game.getInstance().setColorChosen(c);
		
	}
	
	
}