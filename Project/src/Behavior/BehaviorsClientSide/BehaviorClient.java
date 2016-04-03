package Behavior.BehaviorsClientSide;

import Behavior.Behavior;
import Model.Client;

public abstract class BehaviorClient extends Behavior {
	
	protected Client client;
	
	public BehaviorClient(Client c, boolean needObject){
		super(needObject);
		this.client = c;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	


}
