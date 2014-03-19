package org.michaelgorski.kinetic;


/**
 * Base class for all visible objects.
 * Contains functionality for:
 * <ul>
 * <li>Mouse and touch position detection
 * <li>Managing paint properties (stroke colour, width, fills, line joins, shadow)
 * </ul>
 * @author Michael Gorski
 *
 */
public abstract class KShape extends KNode {

	public static final String LINEJOIN_MITER = "miter";
	public static final String LINEJOIN_ROUND = "round";
	public static final String LINEJOIN_BEVEL = "bevel";
	public static final String LINECAP_BUTT = "butt";
	public static final String LINECAP_ROUND = "round";
	public static final String LINECAP_SQARE = "sqare";
	
	
	protected KShape() {}
	
	
	/**
	 * Draw hit graph using the cached scene canvas.
	 */
	public final native void drawHitFromCache() /*-{
		this.drawHitFromCache();
	}-*/;
	
	
	/**
	 * Draw hit graph using the cached scene canvas.
	 * @param alphaThreshold alpha channel threshold that determines whether or 
	 * not a pixel should be drawn onto the hit graph. Must be a value 
	 * between 0 and 255. The default is 0
	 */
	public final native void drawHitFromCache(int alphaThreshold) /*-{
		this.drawHitFromCache(alphaThreshold);
	}-*/;
	
	
	/**
	 * Retrieve the shape's fill style.
	 * @return The fill style
	 */
	public final native String getFill() /*-{
		return @org.michaelgorski.kinetic.KColor::new(Ljava/lang/String;)(this.fill());
	}-*/;
		
	
	/**
	 * Assign a solid colour fill to the shape.
	 * @param colour The colour to use
	 */
	public final native void setFill(KColor color) /*-{
		this.fill(color.@org.michaelgorski.kinetic.KColor::toString()());
	}-*/;
	
	
	/**
	 * Get fill alpha component. Alpha is a real number between 0 and 1. The default is 1.
	 * @return
	 */
	public final native double getFillAlpha() /*-{
		return this.fillAlpha();
	}-*/;
	
	
	/**
	 * Set fill alpha component. Alpha is a real number between 0 and 1. The default is 1.
	 * @param alpha
	 */
	public final native void setFillAlpha(double alpha) /*-{
		this.fillAlpha(alpha);
	}-*/;
	
	
	/**
	 * Get line cap. Can be butt, round, or square. The default is butt.
	 * @return
	 */
	public final native String getLineCap() /*-{
		return this.lineCap();
	}-*/;
	
	
	/**
	 * Set line cap. Can be butt, round, or square. The default is butt.
	 * @param value
	 */
	public final native void setLineCap(String value) /*-{
		this.lineCap(value);
	}-*/;
	
	
	/**
	 * Get line join. Can be miter, round, or bevel. The default is miter.
	 * @return
	 */
	public final native String getLineJoin() /*-{
		return this.lineJoin();
	}-*/;
	
	
	/**
	 * Get line join. Can be miter, round, or bevel. The default is miter.
	 * @param value can be: miter, round, or bevel
	 */
	public final native void setLineJoin(String value) /*-{
		this.lineJoin(value);
	}-*/;

	
	/**
	 * Retrieve the outline stroke's colour
	 * @return The colour
	 */
	public final native KColor getStroke() /*-{
		return @org.michaelgorski.kinetic.KColor::new(Ljava/lang/String;)(this.stroke());
	}-*/;

	
	/**
	 * Assign an outline stroke color.
	 * @param color
	 */
	public final native void setStroke(KColor color) /*-{
		this.stroke(color.@org.michaelgorski.kinetic.KColor::toString()());
	}-*/;
	
	
	/**
	 * Set stroke enabled flag.
	 * @param v
	 */
	public final native void setStrokeEnabled(boolean v) /*-{
		this.strokeEnabled(v);
	}-*/;
	
	
	/**
	 * Get stroke enabled flag.
	 * @return
	 */
	public final native boolean isStrokeEnabled() /*-{
		return this.strokeEnabled();
	}-*/;
	
	
	/**
	 * Get strokeScale enabled flag. Flag which enables or disables stroke scale. The default is true
	 * @return
	 */
	public final native double getStrokeScaleEnabled() /*-{
		return this.strokeScaleEnabled();
	}-*/;
	
	
	/**
	 * Set strokeScale enabled flag. Flag which enables or disables stroke scale. The default is true
	 * @param value
	 */
	public final native void setStrokeScaleEnabled(boolean value) /*-{
		this.strokeScaleEnabled(value);
	}-*/;
	
	
	/**
	 * Retrieve the outline stroke's width.
	 * @return The stroke width
	 */
	public final native double getStrokeWidth() /*-{
		if (this.strokeWidth() != null) 
			return this.strokeWidth();
		else 
			return 0;
	}-*/;
	
	
	/**
	 * Assign an outline stroke's width.
	 * @param width
	 */
	public final native void setStrokeWidth(double width) /*-{
		this.strokeWidth(width);
	}-*/;

	
	
	
	
	
}
