package view;

import java.awt.event.KeyEvent;

import controller.ControllerFacade;
import controller.Order;
import showboard.IEventPerformer;

public class EventPerformer implements IEventPerformer {
	private ControllerFacade orderPerformer;
	
	public EventPerformer(ControllerFacade orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	public void eventPerform(KeyEvent keyEvent) {
		orderPerformer.orderPerform(keyCodeToOrder(keyEvent.getKeyCode()));
	}
	private Order keyCodeToOrder(int keyCode) {
		switch(keyCode) {
		case KeyEvent.VK_UP:
			return Order.UP;
		case KeyEvent.VK_LEFT:
			return Order.LEFT;
		case KeyEvent.VK_DOWN:
			return Order.DOWN;
		case KeyEvent.VK_RIGHT:
			return Order.RIGHT;
		case KeyEvent.VK_SPACE:
			return Order.SPELL;
		default:
			return Order.NOPE;
		}
	}
}
