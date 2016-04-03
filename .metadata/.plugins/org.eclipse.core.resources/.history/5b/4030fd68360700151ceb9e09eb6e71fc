package app;

import Controller.StateControllerLogin;

import kernel.Game;




public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game.getInstance().push(new StateControllerLogin(Game.getViewFactory().createViewLogin()));
		Game.getInstance().start();
		
		Runtime.getRuntime().addShutdownHook( new Thread(new Runnable() {
			
			@Override
			public void run() {
				Game.getInstance().dispose();
				
			}
		}));
			
	}
}
