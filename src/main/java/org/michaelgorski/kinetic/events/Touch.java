package org.michaelgorski.kinetic.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * This represents a touch point from a {@link KineticEvent} or
 * a {@link KineticStageEvent}.
 * @author mg
 *
 */
public class Touch extends JavaScriptObject {

	
	protected Touch() {}
	
	
	/**
	 * Gives the coordinates relative to the viewport in CSS pixels.
	 * @return
	 */
	public native final int getClientX() /*-{
		return this.clientX;
	}-*/;


	/**
	 * Gives the coordinates relative to the viewport in CSS pixels.
	 * @return
	 */
	public native final int getClientY() /*-{
		return this.clientY;
	}-*/;
		
	
	/**
	 * Gives the coordinates relative to the <html> element in CSS pixels.
	 * @return
	 */
	public native final int getPageX() /*-{
		return this.pageX;
	}-*/;
	
	
	/**
	 * Gives the coordinates relative to the <html> element in CSS pixels.
	 * @return
	 */
	public native final int getPageY() /*-{
		return this.pageY;
	}-*/;
	
	

	
	
}
