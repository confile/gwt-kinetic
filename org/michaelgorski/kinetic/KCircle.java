package org.michaelgorski.kinetic;


/**
 * A circular shape.
 * @author Michael Gorski
 *
 */
public class KCircle extends KShape {

	public static final String CLASS_NAME = "Circle";
	
	protected KCircle() {}
	
	/**
	 * Get radius.
	 * @return
	 */
	public final native double getRadius() /*-{
		return this.radius();
	}-*/;
	
	
	/**
	 * Set radius.
	 * @param radius
	 */
	public final native void setRadius(double radius) /*-{
		this.radius(radius);
	}-*/;
	
	
	
}
