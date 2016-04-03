package Model;

import java.io.Serializable;
import java.util.Random;

import utils.Constants;

public class Player implements Cloneable, Serializable {


	private static final long serialVersionUID = -7855115234148839419L;
	
	private int x;
	private int y;
	private int dx;
	private int dy;
	
	private String pseudo;
	private int score;
	private boolean alive;
	
	private int size = 10;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

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
	
	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public String getPseudo() {
		return this.pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isAlive() {
		return this.alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	/**
	 * 
	 * @param pseudo
	 * @return 
	 */
	public Player(String pseudo) {
		this.setPseudo(pseudo);
		
		Random r = new Random();
		this.setX(r.nextInt(Constants.WIDTH_CANVAS));
		this.setY(r.nextInt(Constants.HEIGHT_CANVAS));	
		this.setDx(0);
		this.setDy(0);
		this.setAlive(true);
		this.setScore(0);

	}
		/**players changed
	 * 
	 * @param x
	 * @param y
	 * @return 
	 */
	public void move(int x, int y) {
		this.setX(this.getX() + x);
		this.setY(this.getY() + y);
		
		
	}
	
	public void move(){
		this.setX(dx + x);
		this.setY(dy + y);
	}
	
	public Player clone() throws CloneNotSupportedException{
		return (Player) super.clone();
	}
	
	public String toString(){
		return "["+x+","+y+"] : vivant : " + alive; 
	}
	
	public void collision(Grid g){
		
		if(g != null){
			if(x <= 0)
				x = 0;
			if(x + size >= g.getWidth() * g.getSizeCells())
				x = g.getWidth() * g.getSizeCells() - size;
			if(y <= 0)
				y = 0;
			if(y+ size >= g.getHeight() * g.getSizeCells())
				y = g.getHeight() * g.getSizeCells() - size;
		}
		
		
	}
	
	public boolean collision(Player p){
		
		
		int d2 = (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y);
		   if (d2>p.size*p.size)
		      return false;
		   else{
			   
			   return true;
		   }
		      
	}

}