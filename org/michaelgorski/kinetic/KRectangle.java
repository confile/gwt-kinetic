package org.michaelgorski.kinetic;


/**
 * A rectangular shape.
 * @author Michael Gorski
 *
 */
public class KRectangle extends KShape {

	public static final String CLASS_NAME = "Rect";
	
	protected KRectangle() {}
	
	
	/**
	 * Retrieve the rectangle shape corner radius.
	 * @return The corner radius
	 */
	public final native double getCornerRadius() /*-{
		return this.cornerRadius();
	}-*/;
	
	
	/**
	 * Assign the rectangle shape corner radius.
	 * @param radius A radius for the rounding of corners
	 */
	public final native void setCornerRadius(double radius) /*-{
		this.cornerRadius(radius);
	}-*/;
	
	
}
