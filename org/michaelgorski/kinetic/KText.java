package org.michaelgorski.kinetic;



/**
 * A text shape.
 * @author Michael Gorski
 *
 */
public class KText extends KShape {

	public static final String CLASS_NAME = "Text";
	
	protected KText() {}
	
	
	/**
	 * Retrieve the font family used by this text shape.
	 * @return The font family (e.g. Arial)
	 */
	public final native String getFontFamily() /*-{
		return this.fontFamily();
	}-*/;
	
	
	/**
	 * Assign the font family used by this text shape.
	 * @param font The font family (e.g. Arial)
	 */
	public final native void setFontFamily(String font) /*-{
		this.fontFamily(font);
	}-*/;
	
	
	/**
	 * Retrieve the font size (in pixels) used by this text shape.
	 * @return The font size
	 */
	public final native int getFontSize() /*-{
		return this.fontSize();
	}-*/;
	
	/**
	 * Assign the font size (in pixels) used by this text shape.
	 * @param size A font size
	 */
	public final native void setFontSize(int size) /*-{
		this.fontSize(size);
	}-*/;
	
	
	/**
	 * Retrieve the text string to display by this shape.
	 * @return The text string
	 */
	public final native String getText() /*-{
		return this.text();
	}-*/;

	
	/**
	 * Assign a text string to display by this shape.
	 * @param text A text string
	 */
	public final native void setText(String text) /*-{
		this.text(text);
	}-*/;
	
	
	
}
