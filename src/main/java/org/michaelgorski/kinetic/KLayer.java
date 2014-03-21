package org.michaelgorski.kinetic;



/**
 * A layer object.
 * Layers contain nodes. Multiple layers can be assigned to a stage. Each will be drawn individually and combined into a single overall drawing.
 * By restricting shapes to certain layers, update operations can be kept to a minimum, which is good for performance.
 * @author Michael Gorski
 */
public class KLayer extends KContainer {

	protected KLayer() {}

	
	/**
	 * In some situations, we may want to update a KineticJS shape as fast as possible, but without causing too many redraws. 
	 * For example, if we want to update an element on the stage via mousemove, we don't want to redraw the layer with 
	 * the draw() method, because the mousemove event could be fired hundreds of times per second, which would result in 
	 * a forced frame rate of over a hundred frames per second.  Often times this can cause jumpy animations because 
	 * browsers simply can't handle excessive redraws. <br><br>
	 * 
	 * For situations like this, it's much better to use the batchDraw() method which automatically hooks redraws 
	 * into the KineticJS animation engine.  No matter how many times you call batchDraw(), KineticJS will automatically 
	 * limit the number of redraws per second based on the maximum number of frames per second that the browser can handle 
	 * at any given point in time.
	 */
	public final native void batchDraw() /*-{
		this.batchDraw();
	}-*/;
		
	
}
