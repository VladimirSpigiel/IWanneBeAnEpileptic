package kernel;

import Controller.GameState;

interface GameStateManager {
	public void swap(GameState g);
	public GameState pop();
	public void push(GameState g);
	public GameState peek();
	public String list();
}
