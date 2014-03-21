package org.michaelgorski.kinetic;

import com.google.gwt.core.client.JsArray;





/**
 * Container constructor.  Containers are used to contain nodes or other containers.
 * @author Michael Gorski
 */
public class KContainer extends KNode {

	protected KContainer() {}
	
	
	/**
	 * Add a node to this container.
	 * @param child A child node
	 */
	public final native void add(KNode child) /*-{
		this.add(child);
	}-*/;
	
	
	/**
	 * Determine if node is an ancestor of descendant.
	 */
	public final native boolean isAncestorOf(KNode node) /*-{
		return this.isAncestorOf(node);
	}-*/;

	
	/** 
	 * Remove and destroy all child nodes of this container.
	 */
	public final native void destroyChildren() /*-{
		this.destroyChildren();
	}-*/;
	
	
	/**
	 * Draws the hit graphs of contained layers. Note that the scene 
	 * graph is not redrawn.
	 */
	public final native void drawHit() /*-{
		this.drawHit();
	}-*/;
	
	
	/**
	 * Draws the scene graphs of contained layers. Note that the hit 
	 * graph is not redrawn.
	 */
	public final native void drawScene() /*-{
		this.drawScene();
	}-*/;
	
	
	/**
	 * Find a Kinetic.Collection of nodes that match the selector. 
	 * Use '#' for id selections and '.' for name selections. 
	 * You can also select by type or class name. Pass multiple selectors separated by a space. <br>
	 * select node with id foo <br>
	 * var node = stage.find('#foo'); <br><br>
	 * select nodes with name bar inside layer <br>
	 * var nodes = layer.find('.bar'); <br>
	 * select node with an id of foo or a name of bar inside layer <br>
	 * var nodes = layer.find('#foo, .bar'); 
	 * @param selector
	 * @return
	 */
	public final native JsArray<KNode> find(String selector) /*-{
		return this.find(selector).toArray();
	}-*/;
	
	
	/** 
	 * Remove all child nodes from this container (doesn't destroy them).
	 */
	public final native void removeChildren() /*-{
		this.removeChildren();
	}-*/;

		
	
	
}
