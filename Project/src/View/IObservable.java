package View;

import Controller.AbstractStateController;

public interface IObservable {
	public void draw();
	public void build();
	public void clear();
	
	public void setData(String name, byte [] data);
	public byte[] getData(String name);
	
	public void initListeners();
	public void setController(AbstractStateController ctrl);
	public AbstractStateController getController();
}
