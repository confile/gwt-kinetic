package org.michaelgorski.kinetic;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Image;


/**
 * An image shape.
 * @author Michael Gorski
 */
public class KImage extends KShape {

	public static final String CLASS_NAME = "Image";
	
	protected KImage() {}

	
	/**
	 * Retrieve the image object of the image shape.
	 * @return The image object
	 */
	public final native Image getImage() /*-{
		return @com.google.gwt.user.client.ui.Image::new(Lcom/google/gwt/dom/client/Element;)(this.getImage());
	}-*/;
	
	
	/**
	 * Assign an image resource to this image shape.
	 * Automatically sets the image extents.
	 * @param res The resource to use for the image
	 */
	public final void setImage(ImageResource res) {
		Image img = new Image(res.getSafeUri());
		setImage(img);
		setWidth(res.getWidth());
		setHeight(res.getHeight());
	}
	
	
	/**
	 * Assign an image object to thus image shape.
	 * @param img The image object to use. Does not support picture inlining, so be careful where you get the picture from.
	 */
	// Does not support picture inlining
	private final native void setImage(Image img) /*-{
		this.setImage(img.@com.google.gwt.user.client.ui.Image::getElement()());
	}-*/;
	
	
	/**
	 * Set crop.
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public final native void setCrop(double x, double y, double width, double height) /*-{
		this.crop({
			x: x,
		  	y: y,
		  	width: width,
		  	height: height
		});
		this.width(width).height(height);
	}-*/;
	
	
	
	
}
