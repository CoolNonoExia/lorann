package view;

import java.awt.event.KeyEvent;

import controller.ControllerFacade;
import controller.Order;

public class EventPerformer {
	private ControllerFacade orderPerformer;
	
	public EventPerformer(ControllerFacade orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	public void eventPerform(KeyEvent KeyCode) {
		
	}
	private Order keyCodeToOrder(int KeyCode) {
		return null;
	}

}
