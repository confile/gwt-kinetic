package org.michaelgorski.kinetic.events;

/**
 * Defines signature for event callbacks.
 * Instantiate this class the same way you did with previous versions of KineticGWT:
 * <ul>
 * <li>node.addEventHandler(EventTypeBasic.CLICK, new IEventHandler() { ... }</li>
 * </ul>
 * @author Ed
 */
public interface KEventHandler
{
	
	/**
	 * Handles an event. Called by Kinetic.
	 * @param event
	 */
	public void handle(KineticEvent event);
}
