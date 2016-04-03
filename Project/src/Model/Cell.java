package Model;

import java.io.Serializable;



public class Cell implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4974365587350871150L;
	private int x;
	private int y;
	protected int size;

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @return 
	 */
	public Cell(int x, int y, int size) {
		this.setX(x*size);
		this.setY(y*size);
		this.setSize(size);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}