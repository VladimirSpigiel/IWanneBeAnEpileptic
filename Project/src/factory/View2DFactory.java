package factory;

import View.IObservable;
import View.View2D.View2DCreateGame;
import View.View2D.View2DDisconnected;
import View.View2D.View2DHelp;
import View.View2D.View2DJoinGame;
import View.View2D.View2DLobby;
import View.View2D.View2DLogin;
import View.View2D.View2DMain;
import View.View2D.View2DPause;
import View.View2D.View2DPlaying;
import View.View2D.View2DScore;


public class View2DFactory implements AbstractViewFactory {


	public IObservable createViewPause() {
		
		return new View2DPause();
	}
	

	public IObservable createViewMain() {
		
		return new View2DMain();
	}

	public IObservable createViewScore() {
		
		return new View2DScore();
	}

	public IObservable createViewHelp() {
		
		return new View2DHelp();
	}

	public IObservable createViewLobby() {
		
		return new View2DLobby();
	}

	public IObservable createViewLogin() {
		
		return new View2DLogin();
	}

	public IObservable createViewCreateGame() {
		
		return new View2DCreateGame();
	}

	public IObservable createViewJoinGame() {
		
		return new View2DJoinGame();
	}

	public IObservable createViewPlaying() {
		
		return new View2DPlaying();
	}
	
public IObservable createViewDisconnected() {
		
		return new View2DDisconnected();
	}
}
