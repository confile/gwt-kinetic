package org.michaelgorski.kinetic.events;


import org.michaelgorski.kinetic.KShape;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The wrapper class for Kinetic native events. Used in KineticGWT event handling system.
 * This event is used with addEventHandler only.
 * 
 * @author SkyCrawl
 */
public class KineticEvent extends JavaScriptObject {

	protected KineticEvent() {}
	
	/**
	 * Get the event target (the node that triggered this event). Useful for handling events in ancestors.
	 * @return The original event target
	 */
	public native final KShape getTarget() /*-{
		return this.target;
	}-*/;
	
	
	/**
	 * Get the an array of {@link Touch}.
	 * @return
	 */
	public native final JsArray<Touch> getTouches() /*-{
		return this.evt.touches;
	}-*/;
	
	

}
