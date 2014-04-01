package org.michaelgorski.kinetic.events;


import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The wrapper class for KineticStage native events. Used in KineticGWT event handling system.
 * This event is used with addStageEventHandler only.
 * 
 * @author SkyCrawl
 */
public class KineticStageEvent extends JavaScriptObject {

	protected KineticStageEvent() {}
	
	
	/**
	 * Get the an array of {@link Touch}.
	 * @return
	 */
	public native final JsArray<Touch> getTouches() /*-{
		return this.touches;
	}-*/;
	
	

}
