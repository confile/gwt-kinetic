package org.michaelgorski.kinetic.events;

/**
 * Defines signature for event callbacks.
 * Instantiate this class the same way you did with previous versions of KineticGWT:
 * <ul>
 * <li>stage.addStageEventHandler(EventTypeBasic.CLICK, new IEventHandler() { ... }</li>
 * </ul>
 * @author Ed
 */
public interface KStageEventHandler
{
	/**
	 * Handles an event. Called by Kinetic.
	 * @return True, if the event should stop being processed further by bubbling up in the hierarchy. False, if bubbling should continue. 
	 */
	public void handle(KineticStageEvent event);
}
