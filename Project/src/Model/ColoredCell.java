package Model;

import java.io.Serializable;
import java.util.Random;

public class ColoredCell extends Cell implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7469693824120503270L;
	protected Color color;
	
	
	
	public ColoredCell(int x, int y, int size){
		super(x, y, size);
		this.color = new Color();
		this.color.setR(new Random().nextInt(255));
		this.color.setG(new Random().nextInt(255));
		this.color.setB(new Random().nextInt(255));
		
	}
	
	public ColoredCell(int x, int y, int size, Random r){
		super(x, y, size);
		this.color = new Color();
		this.color.setR(r.nextInt(255));
		this.color.setG(r.nextInt(255));
		this.color.setB(r.nextInt(255));
	}
	
	
	public void setColor(Color c){
		this.color = c;
	}
	
	public Color getColor(){
		return this.color;
	}

	public String toString(){
		return "[" + this.getY() + "," + this.getX() +"]" + color.toString() ;
	}
}