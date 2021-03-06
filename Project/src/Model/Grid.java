package Model;

import java.io.Serializable;
import java.util.Random;



public class Grid implements Serializable {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3597883913770953225L;
	private int width;
	private int height;
	private Difficulty difficulty;
	private int sizeCells;
	private ColoredCell[][] cells;
	
	public int getSizeCells() {
		return sizeCells;
	}

	public void setSizeCells(int sizeCells) {
		this.sizeCells = sizeCells;
	}

	//private ArrayList<ColoredCell> cells;
	

	public int getWidth() {
		return this.width;
	}

	protected void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	protected void setHeight(int height) {
		this.height = height;
	}

	/**
	 * 
	 * @param difficulte
	 */
	
	
	
	public Grid(Difficulty difficulte, Random generator) {
		this.difficulty = difficulte;
		if(this.difficulty == Difficulty.EASY){
			this.setHeight(3);
			this.setWidth(6);
			this.setSizeCells(70);
						
		}else if(this.difficulty == Difficulty.MEDIUM){
			
			
			this.setHeight(7);
			this.setWidth(14);
			this.setSizeCells(30);
		}else if(this.difficulty == Difficulty.HARD){
			this.setHeight(14);
			this.setWidth(28);
			this.setSizeCells(15);
		}
		
		this.cells = new ColoredCell[this.getHeight()][this.getWidth()];
			
		for(int y=0; y < getHeight(); y++){
			for(int x=0; x < getWidth(); x++){
				this.cells[y][x] = new ColoredCell(x, y, this.getSizeCells(), generator);
			}
		}
	
			
	}

	/**
	 * 
	 * @return 
	 */
	public Color getRandomColor() {
		
		return this.getCells()[new Random().nextInt(getHeight())][new Random().nextInt(getWidth())].getColor();

	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public ColoredCell getCellAt(int x, int y) {
		if(x < getWidth() && y< getHeight()){
			return getCells()[y][x];
		}
			
		return null;
	}
	
	public ColoredCell[][] getCells(){
		return this.cells;
	}
	
	public String toString(){
		return this.getCellAt(0, 0) + " AND " + this.getCellAt(getWidth()-1, getHeight()-1);
	}
	
	public void show(Color c){
		for(int y = 0; y < getHeight(); y++){
			for(int x = 0; x < getWidth(); x++){
				if(!getCells()[y][x].getColor().equals(c)){
					Color toHide = getCells()[y][x].getColor();
					toHide.setR(255);
					toHide.setG(255);
					toHide.setB(255);
				}
			}
		}
	}

}