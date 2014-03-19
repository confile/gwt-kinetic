package org.michaelgorski.kinetic;

import java.util.Arrays;
import java.util.List;

import org.michaelgorski.kinetic.events.KEventHandler;
import org.michaelgorski.kinetic.events.KEventTypeEnum;

import com.google.gwt.dom.client.Element;



/**
 * Stage constructor. A stage is used to contain multiple layers The stage
 * contains everything that is drawn. It consists of layers, which in turn
 * contain the shapes.
 * 
 * @author Michael Gorski
 * 
 */
public class KStage extends KContainer {

	
	/**
	 * Callback interface for receiveing a data URL string.
	 * @author Michael Gorski
	 */
	public interface DataUrlCallback {
		/**
		 * Receive a data URL string.
		 * @param dataUrl The data URL string
		 */
		public void onSuccess(String dataUrl);
	}
	
	
	
	protected KStage() {
	}

	
	/**
	 * Add a new layer to the stage.
	 * 
	 * @param layer The new layer
	 */
	public final native void add(final KLayer layer) /*-{
		this.add(layer);
	}-*/;
	
	
	/**
	 * Get container DOM element. The container is the html div element you 
	 * created to hold all the sub-elements that KineticJS will create.
	 * @return
	 */
	public final native Element getContainer() /*-{
		return this.container();
	}-*/;
	
	
	/**
	 * Set container DOM element. The container is the html div element you 
	 * created to hold all the sub-elements that KineticJS will create.
	 * @return
	 */	
	public final native void setContainer(Element e) /*-{
		this.container(e);
	}-*/;
	
	
	/**
	 * The content is a child div that KineticJS creates inside your container element.
	 * Get stage content <div> element which has the the class name "kineticjs-content".
	 * This will let us get mouse events even on areas not filled with kinetic nodes.
	 * @return
	 */
	public final native Element getContent() /*-{
		return this.getContent();
	}-*/;
		
	
	/**
	 * Retrieve a URL to the stage's data.
	 * @param c A callback handler that will receive the data url
	 */
	public final void toDataURL(DataUrlCallback c) {
		toDataURL("image/png", c);
	}
		
	
	/**
	 * Retrieve a URL to the stage's data.
	 * @param mimeType can be "image/png" or "image/jpeg". "image/png" is the default
	 * @param c A callback handler that will receive the data url
	 */
	public final void toDataURL(String mimeType, DataUrlCallback c) {
		toDataURL(mimeType, 1.0d, c);
	}
	
	
	/**
	 * Retrieve a URL to the stage's data.
	 * @param mimeType can be "image/png" or "image/jpeg". "image/png" is the default
	 * @param quality jpeg quality. If using an "image/jpeg" mimeType, you can specify the quality from 0 to 1, 
	 * where 0 is very poor quality and 1 is very high quality
	 * @param c A callback handler that will receive the data url
	 */
	public final native void toDataURL(String mimeType, double quality, DataUrlCallback c) /*-{
		this.toDataURL({
			mimeType: mimeType,
	      	callback: function(dataUrl) {
	        	c.@org.michaelgorski.kinetic.KStage.DataUrlCallback::onSuccess(Ljava/lang/String;)(dataUrl);
	      	}
	    });
	}-*/;
			
	
	/**
	 * Convert a dataURL to a blob.
	 * @param dataURI
	 * @return
	 */
	public final native String dataURItoBlob(String dataURI) /*-{
	    // convert base64 to raw binary data held in a string
	    var byteString = atob(dataURI.split(',')[1]);
	 
	    // separate out the mime component
	    var mimeString = dataURI.split(',')[0].split(':')[1].split(';')[0];
	 
	    // write the bytes of the string to an ArrayBuffer
	    var arrayBuffer = new ArrayBuffer(byteString.length);
	    var _ia = new Uint8Array(arrayBuffer);
	    for (var i = 0; i < byteString.length; i++) {
	        _ia[i] = byteString.charCodeAt(i);
	    }
	 
	    var dataView = new DataView(arrayBuffer);
	    var blob = new Blob([dataView], { type: mimeString });
	    return blob;		
	}-*/;
	
	
	/**
	 * Register an event handler on stage.getContent(). I.e., <br>
	 * stage.getContent().addEventListener('touchmove', function(evt) { ... }, false); <br> 
	 * @param type A single event type to listen for.
	 * @param handler The handler.
	 */
	public final void addStageEventHandler(KEventTypeEnum type, KEventHandler handler) {
		addStageEventHandler(Arrays.asList(type), handler);
	}
	
	
	/**
	 * Register an event handler for a multitude on stage.getContent(). I.e., <br>
	 * stage.getContent().addEventListener('touchmove', function(evt) { ... }, false); <br> 
	 * @param type List of events to listen for
	 * @param handler The handler.
	 */
	public final void addStageEventHandler(List<KEventTypeEnum> eventTypes, KEventHandler handler)	{
		addStageEventHandlers(eventListToString(eventTypes), handler);
	}
	
	
	/**
	 * Add a (possibly) multi-event handlers to stage.getContent().
	 * @param eventString The string containing events to register.
	 * @param handler The handler to execute.
	 */
	protected final native void addStageEventHandlers(String eventString, KEventHandler handler) /*-{
		this.getContent().addEventListener(eventString, function(evt) {
			handler.@org.michaelgorski.kinetic.events.KEventHandler::handle(Lorg/michaelgorski/kinetic/events/KineticEvent;)(evt);
		}, false);
	}-*/;
	
	
	

}
