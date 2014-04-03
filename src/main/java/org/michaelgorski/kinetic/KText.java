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
	 * Get horizontal align of text. Can be 'left', 'center', or 'right'.
	 * @return
	 */
	public final native String getAlign() /*-{
		return this.align();
	}-*/;
	
	
	/**
	 * Set horizontal align of text. Can be 'left', 'center', or 'right'.
	 * @param value
	 */
	public final native void setAlign(String value) /*-{
		this.align(value);
	}-*/;
	
	
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
	public final native double getFontSize() /*-{
		return this.fontSize();
	}-*/;
	
	/**
	 * Assign the font size (in pixels) used by this text shape.
	 * @param size A font size
	 */
	public final native void setFontSize(double size) /*-{
		this.fontSize(size);
	}-*/;
	
	
	/**
	 * Get font style. Can be 'normal', 'italic', or 'bold'. 'normal' is the default.
	 * @return
	 */
	public final native String getFontStyle() /*-{
		return this.fontStyle();
	}-*/;
	
	
	/**
	 * Set font style. Can be 'normal', 'italic', or 'bold'. 'normal' is the default.
	 * @param style
	 */
	public final native void setFontStyle(String style) /*-{
		this.fontStyle(style);
	}-*/;
	
	
	/**
	 * Get font variant. Can be 'normal' or 'small-caps'. 'normal' is the default.
	 * @return
	 */
	public final native String getFontVariant() /*-{
		return this.fontVariant();
	}-*/;
	
	
	/**
	 * Set font variant. Can be 'normal' or 'small-caps'. 'normal' is the default.
	 * @param value
	 */
	public final native void setFontVariant(String value) /*-{
		this.fontVariant(value);
	}-*/;
	
	
	/**
	 * Get line height. The default is 1.
	 * @return
	 */
	public final native double getLineHeight() /*-{
		return this.lineHeight();
	}-*/;

	
	/**
	 * Set line height. The default is 1.
	 * @param value
	 */
	public final native void setLineHeight(double value) /*-{
		this.lineHeight(value);
	}-*/;
	
	
	/**
	 * Get padding.
	 * @return
	 */
	public final native double getPadding() /*-{
		return this.padding();
	}-*/;
		
	
	/**
	 * Set padding.
	 * @param value
	 */
	public final native void setPadding(double value) /*-{
		this.padding(value);
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
