
package Controller;

import View.IObservable;
import event.*;


public abstract class AbstractStateController implements GameState, KeyEvent, MouseEvent, ActionEvent {
		protected IObservable view;

		public AbstractStateController(IObservable v) {
			this.view = v;
			this.view.setController(this);	
			
			
		}
		
		public IObservable getView(){
			return this.view;
		}
		
		public void entered(){
			this.view.initListeners();

			this.view.build();
			
		}
		
		public void leaving(){
			this.view.clear();
		}
}
