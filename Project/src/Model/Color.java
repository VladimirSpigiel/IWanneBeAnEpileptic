package Model;

import java.io.Serializable;

public class Color implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5912454383196745087L;
	private int r;
	private int g;
	private int b;
	

	public int getR() {
		return this.r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return this.g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return this.b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Color() {
		
	}

	/**
	 * 
	 * @param r
	 * @param g
	 * @param b
	 */
	public Color(int r, int g, int b) {
		this.setR(r);
		this.setG(g);
		this.setB(b);
	}
	
	public String toString(){
		return "("+this.getR() + ","+ this.getG() +"," + this.getB() + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + b;
		result = prime * result + g;
		result = prime * result + r;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Color other = (Color) obj;
		if (b != other.b)
			return false;
		if (g != other.g)
			return false;
		if (r != other.r)
			return false;
		return true;
	}
	
		

}