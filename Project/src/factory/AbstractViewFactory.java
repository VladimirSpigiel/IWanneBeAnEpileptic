package factory;

import View.IObservable;

public interface AbstractViewFactory {

	/**
	 * 
	 * @return 
	 */
	public IObservable createViewMain();

	/**
	 * 
	 * @return 
	 */
	public IObservable createViewScore();

	/**
	 * 
	 * @return 
	 */
	public IObservable createViewHelp();

	/**
	 * 
	 * @return 
	 */
	public IObservable createViewLobby();

	/**
	 * 
	 * @return 
	 */
	public IObservable createViewLogin();

	/**
	 * 
	 * @return 
	 */
	public IObservable createViewCreateGame();

	/**
	 * 
	 * @return 
	 */
	public IObservable createViewJoinGame();

	/**
	 * 
	 * @return 
	 */
	public IObservable createViewPlaying();
	
	public IObservable createViewDisconnected();

}