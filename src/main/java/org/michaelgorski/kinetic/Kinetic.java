package org.michaelgorski.kinetic;


import com.google.gwt.core.client.Callback;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ImageResource;


/**
 * Factory class for creating Kinetic objects. Use methods from this class to create Kinetic objects. 
 * @author Michael Gorski
 */
public class Kinetic {
	
	/**
	 * Create a new stage object.
	 * @param stageContainer The DOM element that Kinetic should use
	 * @param stageWidth The stage's horizontal extent
	 * @param stageHeight The stage's vertical extent
	 * @return A stage object.
	 * @see KStage
	 */
	public static native KStage createStage(Element stageContainer, double stageWidth, double stageHeight) /*-{
	    var createStage = $entry(function(stageContainer, stageWidth, stageHeight) {
		    return new $wnd.Kinetic.Stage({
		        container: stageContainer,
		        width: stageWidth,
		        height: stageHeight
			});
	    });
		return createStage(stageContainer, stageWidth, stageHeight);
	}-*/;
	
	
	/**
	 * Create an ellipse shape.
	 * @return KEllipse
	 */
	public static native KEllipse createcreateEllipse() /*-{
	    var createEllipse = $entry(function() {
	    	return new $wnd.Kinetic.Ellipse();
	    });
	    return createEllipse();
	}-*/;
	
	
	/**
	 * Create a layer object.
	 * The layer will be independent and needs to be added to a stage.
	 * @return A new layer object
	 * @see KLayer
	 */
	public static native KLayer createLayer() /*-{
		var createLayer = $entry(function() {
			return new $wnd.Kinetic.Layer();
		});
	    return createLayer();
	}-*/;
	
	
	/**
	 * Create a fast layer onject.
	 * FastLayer for ultra fast rendering. If you don't need node nesting, 
	 * mouse and touch interactions, or event pub/sub, you should use FastLayer 
	 * instead of Layer to create your layers. It renders about 2x faster than normal layers.
	 * @return
	 */
	public static native KFastLayer createFastLayer() /*-{
		var createFastLayer = $entry(function() {
			return new $wnd.Kinetic.FastLayer();
		});
	    return createFastLayer();
	}-*/;

	
	/**
	 * Create a layer object.
	 * This method also adds the layer to a given stage.
	 * @param stage The stage to add the layer to
	 * @return A new layer object
	 * @see KLayer
	 */
	public static KLayer createLayer(KStage stage) {
		final KLayer layer = Kinetic.createLayer();
		stage.add(layer);
		return layer;
	}
	
	
	/**
	 * Create a regular polygon shape.
	 * @see KRegularPolygon
	 */
	public static native KRegularPolygon createRegularPolygon() /*-{
	    var createRect = $entry(function() {
	    	return new $wnd.Kinetic.RegularPolygon();
	    });
	    return createRect();
	}-*/;
	
	
	/**
	 * Create a star shape.
	 * @return KStar
	 */
	public static native KStar createStar() /*-{
	    var createStar = $entry(function() {
	    	return new $wnd.Kinetic.Star();
	    });
	    return createStar();
	}-*/;
	
	
	/**
	 * Create an image shape.
	 * @see KImage
	 * @return
	 */
	public static native KImage createImage() /*-{
		var createImage = $entry(function() {
			return new $wnd.Kinetic.Image();
		});
	    return createImage();
	}-*/;
	
	
	/**
	 * Create an image shape from an image url.
	 * @param url
	 * @param callback
	 */
	public static native void createImage(String url, Callback<KImage, String> callback) /*-{
	    var imageObj = new Image();
	    
	    var callbackDone = $entry(function(kimage) {	
			callback.@com.google.gwt.core.client.Callback::onSuccess(Ljava/lang/Object;)(kimage);
		});
	    
	    imageObj.onload = function() {
	    	var createImage = $entry(function(imageObj) {
				return new $wnd.Kinetic.Image({image: imageObj});
			});
	    	
		    var kimage = createImage(imageObj);
		    					
		    callbackDone(kimage);					
	    }
	    imageObj.src = url;
	}-*/;
	
	
	/**
	 * Create an image shape.
	 * @param img
	 * @return
	 */
	public static native KImage createImage(com.google.gwt.user.client.ui.Image img) /*-{
	    var createImage = $entry(function(imageObj) {
	    	return new $wnd.Kinetic.Image({
	    		image: imageObj.@com.google.gwt.user.client.ui.Image::getElement()()});
	    });
	    
	    return createImage(img);
	    
	    // old version
//	    return new $wnd.Kinetic.Image({
//	    	image: img.@com.google.gwt.user.client.ui.Image::getElement()()});
	}-*/;


	/**
	 * Create an image shape.
	 * @param res
	 * @return
	 */
	public static native KImage createImage(ImageResource res) /*-{
		
		var createImageFromRes = $entry(function(resource) {
			return @com.google.gwt.user.client.ui.Image::new(Lcom/google/gwt/safehtml/shared/SafeUri;)(resource.@com.google.gwt.resources.client.ImageResource::getSafeUri()());
		});
		
	    var img = createImageFromRes(res);
	    
	    var createImage = $entry(function(imageObj) {
	    	return new $wnd.Kinetic.Image({
	    		image: imageObj.@com.google.gwt.user.client.ui.Image::getElement()()});
	    });
	    
	    return createImage(img);
	    
	    // old version
	    
//	     var img = @com.google.gwt.user.client.ui.Image::new(Lcom/google/gwt/safehtml/shared/SafeUri;)(res.@com.google.gwt.resources.client.ImageResource::getSafeUri()()); 
//	   
//	    return new $wnd.Kinetic.Image({
//	    	image: img.@com.google.gwt.user.client.ui.Image::getElement()()});
	}-*/;

	
	/**
	 * Create a line shape. The line will consist of a number of points.
	 * @return
	 */
	public static native KLine createLine() /*-{
		var createLine = $entry(function() {
			return new $wnd.Kinetic.Line();
		});
		
		return createLine();
	}-*/;
	
	
	/**
	 * Create a shape group.
	 * @return  An empty group
	 * @see KGroup
	 */
	public static native KGroup createGroup() /*-{
		var createGroup = $entry(function() {
			return new $wnd.Kinetic.Group();
		});
		
	    return createGroup();
	}-*/;
		
	
	/**
	 * Create a circle shape.
	 * @return The circle shape
	 * @see KCircle
	 */
	public static native KCircle createCircle() /*-{
	    var createCircle = $entry(function() {
	    	return new $wnd.Kinetic.Circle();
	    });
	    return createCircle();
	}-*/;
	
	
	/**
	 * Create a rectangle shape
	 * @return
	 */
	public static native KRectangle createRectangle() /*-{
	    var createRectangle = $entry(function() {
	    	return new $wnd.Kinetic.Rect();
	    });
	    return createRectangle();
	}-*/;
	
	
	/**
	 * Create a text shape.
	 * @return
	 */
	public static native KText createText() /*-{
		var createText = $entry(function() {
			return new $wnd.Kinetic.Text();
		});
		return createText();
	}-*/;
	

	/**
	 * Create a text shape.
	 * @param text aText
	 * @return
	 */
	public static native KText createText(String text) /*-{
		var createText = $entry(function(t) {
			return new $wnd.Kinetic.Text({
				text: t
			});
		});
		
		return createText(text);
	}-*/;
	
		
	/**
	 * Create a wedget shape.
	 * @return KWedge
	 */
	public static native KWedge createWedge() /*-{
	    var createWedge = $entry(function() {
	    	return new $wnd.Kinetic.Wedge();
	    });
	    return createWedge();
	}-*/;


}
