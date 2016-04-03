package Behavior;


public abstract class Behavior {
	
	
	protected Object object;
	private boolean needObject;
	
	public Behavior(boolean needObject){
		this.needObject = needObject;
	}
	
	public abstract void execute();

	

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public boolean needObject() {
		return needObject;
	}

	public void setNeedObject(boolean needObject) {
		this.needObject = needObject;
	}
	
	
	
	

	
	
	
}