package org.michaelgorski.kinetic;



import java.util.Arrays;
import java.util.List;

import org.michaelgorski.kinetic.events.KEventHandler;
import org.michaelgorski.kinetic.events.KEventTypeEnum;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base class for all of the Kinetic classes. Node constructor. Nodes are
 * entities that can be transformed, layered,and have bound events. The stage,
 * layers, groups, and shapes all extend Node.
 * 
 * @See <a href="http://kineticjs.com/docs/Kinetic.Node.html">Node</a>
 * @author Michael Gorski
 */
public abstract class KNode extends JavaScriptObject {

	protected KNode() {
	}
	
	
	
	/**
	 * Retrieve the node's absolute opacity.
	 * @return A value between 0 and 1. 0 is complete transparency and 1 is complete opaque.
	 */
	public native final double getAbsoluteOpacity() /*-{
		return this.getAbsoluteOpacity();
	}-*/;
	
	
	/**
	 * Retrieve the node's absolute position.
	 * @return The position
	 */
	public native final Vector2d getAbsolutePosition() /*-{
		var pos = this.getAbsolutePosition();
		return @org.michaelgorski.kinetic.Vector2d::new(DD)(pos.x, pos.y);
	}-*/;
	
	
	/**
	 * Get filter blue value.
	 * @return
	 */
	public native final int getBlue() /*-{
		return this.blue();
	}-*/;
	
	
	/**
	 * Set filter blue value.
	 * @param v
	 */
	public native final void setBlue(int v) /*-{
		this.blue(v);
	}-*/;
	
	
	/**
	 * Get blur radius.
	 * @return
	 */
	public native final int getBlurRadius() /*-{
		return this.blurRadius();
	}-*/;

	
	/**
	 * Set blur radius.
	 * @param v
	 */
	public native final void setBlurRadius(int v) /*-{
		this.blurRadius(v);
	}-*/;
		
		
	/**
	 * Set the node's absolute position.
	 * @param position The position
	 */
	public final native void setAbsolutePosition(final Vector2d p) /*-{
		this.setAbsolutePosition({
			x: p.@org.michaelgorski.kinetic.Vector2d::x, 
			y: p.@org.michaelgorski.kinetic.Vector2d::y 
			});
	}-*/;
	
	
	/**
	 * Retrieve the node's absolute Z index.
	 * @return The z index
	 */
	public native final double getAbsoluteZIndex() /*-{
		return this.getAbsoluteZIndex();
	}-*/;
	
	
	/**
	 * Cache node to improve drawing performance, apply filters, 
	 * or create more accurate hit regions
	 */
	public native final void cache() /*-{
		this.cache();
	}-*/;
	
	
	/**
	 * Clear scene and hit canvas contexts tied to the layer.
	 */
	public native final void clear() /*-{
		this.clear();
	}-*/;
	
	
	/**
	 * Clear cached canvas.
	 */
	public native final void clearCache() /*-{
		this.clearCache();
	}-*/;
	
	
	/**
	 * Get class name, which may return Stage, Layer, Group, or shape class 
	 * names like Rect, Circle, Text, etc.
	 * @return class name
	 */
	public native final String getClassName() /*-{
		return this.getClassName();
	}-*/;
	
	
	/**
	 * Returns a new Node instance with identical attributes. 
	 */
	public native final KNode clone() /*-{
		return this.clone();
	}-*/;

	
	/**
	 * Remove and destroy self.
	 */
	public native final void destroy() /*-{
		return this.destroy();
	}-*/;
	
	
	/**
	 * makes the node draggable. When stages are draggable, 
	 * you can drag and drop the entire stage by dragging any 
	 * portion of the stage
	 */
	public final native void setDraggable(boolean value) /*-{
		this.draggable(value);
	}-*/;
	
	
	/**
	 * Checks if a node can be dragged.
	 * @return True, in case that the node can be dragged. False, otherwise.
	 */
	public final native boolean isDraggable() /*-{
		return this.draggable();
	}-*/;
	

	/**
	 * If true dragging is only allowed horizontally. Note that to enable dragging 
	 * you have to use {@link #setDraggable(boolean)} set to true.
	 * @param value
	 */
	public final native void setDraggableHorizontalOnly(boolean value) /*-{
		if (value) {
			this.dragBoundFunc(function(pos){
				return {
			    	x: pos.x,
			    	y: this.getAbsolutePosition().y
			  	};
			});
		}
		else {
			this.dragBoundFunc(function(pos){
				return {
			    	x: pos.x,
			    	y: pos.y
			  	};
			});
		}
	}-*/;
	
	
	/**
	 * Allow horizontal dragging inside borders: minX < x < maxX. Note that to enable dragging 
	 * you have to use {@link #setDraggable(boolean)} set to true.
	 * @param minX
	 * @param maxX
	 */
	public final native void setDraggableHorizontalOnly(double minX, double maxX) /*-{
		this.dragBoundFunc(function(pos){
			var X = pos.x;

          	if (X < minX) { X = minX; }
          	if (X > maxX) { X = maxX; }
			
			return {
		    	x: X,
		    	y: this.getAbsolutePosition().y
		  	};
		});
	}-*/;
	
	
	/**
	 * If true dragging is only allowed vertically. Note that to enable dragging 
	 * you have to use {@link #setDraggable(boolean)} set to true.
	 * @param value
	 */
	public final native void setDraggableVerticalOnly(boolean value) /*-{
		if (value) {
			this.dragBoundFunc(function(pos){
				return {
			    	x: this.getAbsolutePosition().x,
			    	y: pos.y
			  	};
			});
		}
		else {
			this.dragBoundFunc(function(pos){
				return {
			    	x: pos.x,
			    	y: pos.y
			  	};
			});
		}
	}-*/;
	
	
	
	/**
	 * Allowed vertical dragging inside borders: minY < y <  maxY. Note that to enable dragging 
	 * you have to use {@link #setDraggable(boolean)} set to true.
	 * @param minY
	 * @param maxY
	 */
	public final native void setDraggableVerticalOnly(double minY, double maxY) /*-{

		this.dragBoundFunc(function(pos){
			var Y = pos.y;
			
			if (Y < minY) { Y = minY; }
          	if (Y > maxY) { Y = maxY; }
			
			return {
		    	x: this.getAbsolutePosition().x,
		    	y: Y
		  	};
		});

	}-*/;
	
	
	/**
	 * Draw both scene and hit graphs. If the node being drawn is the stage, all
	 * of the layers will be cleared and redrawn
	 */
	public native final void draw() /*-{
		this.draw();
	}-*/;
	
	
	/**
	 * Get emboss direction.
	 */
	public native final boolean getEmbossBlend() /*-{
		return this.embossBlend();
	}-*/;
	
	
	/**
	 * Set emboss blend.
	 * @param e
	 */
	public native final void setEmbossBlend(boolean e) /*-{
		this.embossBlend(e);
	}-*/;
	
	
	/**
	 * Get emboss direction. Can be top-left, top, top-right, right, bottom-right, bottom, bottom-left or left The default is top-left
	 * @return
	 */
	public native final String getEmbossDirection() /*-{
		return this.embossBlend();
	}-*/;
	
	
	/**
	 * Set emboss direction. Can be top-left, top, top-right, right, bottom-right, bottom, bottom-left or left The default is top-left
	 * @param d
	 */
	public native final void setEmbossDirection(String d) /*-{
		this.embossBlend(d);
	}-*/;
		
	
	/**
	 * Gets the height of the node.
	 * @return node height of the node
	 */
	public native final double getHeight() /*-{
		if (this.height() == "auto") 
			return 0;
		else 
			return this.height()
	}-*/;	
	
	
	/**
	 * Sets the height of the node. Uses bounding boxes around select nodes. 
	 * For example, to define the size of an ellipse, 
	 * you could set its width and height rather than setting the radius.
	 * @param width pixels in height
	 */
	public native final void setHeight(double h) /*-{
		this.height(h);
	}-*/;
	
	
	/**
	 * Hides this node.
	 * Used in conjunction with {@link #show()}
	 */
	public final native void hide() /*-{
		this.hide();
	}-*/;
	
	
	/**
	 * Retrieve a node's unique identifier.
	 * @return The identifier or <emph>null</emph> if not set.
	 */
	public final native String getId() /*-{
		return this.id();
	}-*/;
	
	
	/**
	 * Set a unique identifier for this node.
	 * @param newId An identifier.
	 */
	public final native void setId(String newId) /*-{
		this.id(newId);
	}-*/;
	
	
	/**
	 * Gets layer ancestor.
	 * @return container layer
	 */
	public native final KLayer getLayer() /*-{
		return this.getLayer();
	}-*/;
	
	
	
	/**
	 * Move the node's position relative to container.
	 * @param position The position
	 */
	public final native void move(final Vector2d p) /*-{
		this.move(p.@org.michaelgorski.kinetic.Vector2d::x, p.@org.michaelgorski.kinetic.Vector2d::y);
	}-*/;
	
	
	/**
	 * Move the node's position relative to container.
	 * @param x A horizontal position
	 * @param y A vertical position
	 */
	public final native void move(double x, double y) /*-{
		this.move(x,y);
	}-*/;
	
		
	/**
	 * Moves the node to the lowest Z position.
	 * It will be behind all of the other nodes on a given layer.
	 * Node needs to belong to a layer.
	 */
	public final native void moveToBottom() /*-{
		this.moveToBottom();
	}-*/;
	
	
	/**
	 * Move this node into the specified container.
	 * @param newContainer The container to move this node to.
	 */
	public final native void moveTo(KContainer newContainer) /*-{
		this.moveTo(newContainer);
	}-*/;
	
	
	/**
	 * Decreases the Z position of the node.
	 * Node needs to belong to a layer.
	 */
	public final native void moveDown() /*-{
		this.moveDown();
	}-*/;
	
	
	/**
	 * Moves the node to the highest Z position.
	 * It will be in front of all of the other nodes on a given layer.
	 * Node needs to belong to a layer.
	 */
	public final native void moveToTop() /*-{
		this.moveToTop();
	}-*/;
	
	
	/**
	 * Increases the Z position of the node.
	 * Node needs to belong to a layer.
	 */
	public final native void moveUp() /*-{
		this.moveUp();
	}-*/;
		
	
	/**
	 * Retrieve a node's name.
	 * @return The name or <emph>null</emph> if not set.
	 */	
	public final native String getName() /*-{
		return this.name();
	}-*/;

	
	/**
	 * Set a name for this node.
	 * Names do not have to be unique - two nodes with the same name can exist.
	 * @param newName A name.
	 */
	public final native void setName(String newName) /*-{
		this.name(newName);
	}-*/;
	
	
	/**
	 * Get offset x.
	 */
	public native final double getOffsetX() /*-{
		return this.offsetX();
	}-*/;

	/**
	 * Set offset x.
	 */
	public native final void setOffsetX(double offsetX) /*-{
		this.offsetX(offsetX);
	}-*/;
	
	
	/**
	 * Get offset y.
	 */
	public native final double getOffsetY() /*-{
		return this.offsetY();
	}-*/;

	
	/**
	 * Set offset y.
	 */
	public native final void setOffsetY(double offsetY) /*-{
		this.offsetY(offsetY);
	}-*/;
	
		
	/**
	 * Retrieve the opacity of the complete node.
	 * @return A value between 0 and 1. 0 is complete transparency and 1 is complete opaque.
	 */
	public final native double getOpacity() /*-{
		return this.opacity();
	}-*/;

	
	/**
	 * Set the opacity of the complete node.
	 * @param op A value between 0 and 1. 0 is complete transparency and 1 is complete opaque.
	 */
	public final native void setOpacity(double op) /*-{
		this.opacity(op);
	}-*/;
	
	
	/**
	 * Get node position relative to parent.
	 * @return
	 */
	public native final Vector2d getPosition() /*-{
		var pos = this.position();
		return @org.michaelgorski.kinetic.Vector2d::new(DD)(pos.x, pos.y);
	}-*/;
	
	
	/**
	 * Set the node's position relative to container.
	 * @param position The position
	 */
	public final native void setPosition(final Vector2d p) /*-{
		this.position(p.@org.michaelgorski.kinetic.Vector2d::x, p.@org.michaelgorski.kinetic.Vector2d::y);
	}-*/;
	
	
	/**
	 * Set the node's position relative to container.
	 * @param x
	 * @param y
	 */
	public final native void setPosition(double x, double y) /*-{
		this.position(x,y);
	}-*/;
	
	
	/**
	 * Rotate node by an amount in degrees relative to its current rotation
	 * @param theta
	 * @return
	 */
	public final native void rotate(double theta) /*-{
		this.rotate(theta);
	}-*/;

	
	/**
	 * Get rotation in degrees.
	 * @return
	 */
	public final native double getRotation() /*-{
		return this.rotation();
	}-*/;
	
	
	/**
	 * Set rotation in degrees.
	 * @return
	 */
	public final native void setRotation(double theta) /*-{
		this.rotation(theta);
	}-*/;
	
	
	public final native Vector2d getScale() /*-{
		var scale = this.scale();
		return @org.michaelgorski.kinetic.Vector2d::new(DD)(scale.x, scale.y);
	}-*/;
		
	
	public final native void setScale(final Vector2d s) /*-{
		this.scale({x: s.@org.michaelgorski.kinetic.Vector2d::x,
					y: s.@org.michaelgorski.kinetic.Vector2d::y});
	}-*/;
	
	
	public final native double getScaleX() /*-{
		return this.scaleX();
	}-*/;
	
	
	public final native void setScaleX(double s) /*-{
		this.scaleX(s);
	}-*/;
	
	
	public final native double getScaleY() /*-{
		return this.scaleY();
	}-*/;
	
	
	public final native void setScaleY(double s) /*-{
		this.scaleY(s);
	}-*/;
	
	
	/**
	 * Makes this node visible.
	 * Used in conjunction with {@link #hide()}
	 */
	public final native void show() /*-{
		this.show();
	}-*/;
	
	
	/**
	 * Get stage ancestor.
	 */
	public final native KStage getStage() /*-{
		return this.getStage();
	}-*/;
	
	
	/**
	 * Write the current node's definition to JSON.
	 * Doesn't serialize functions and images. These need to be written manually.
	 * @return A JSON representation of the node
	 */
	public final native String toJSON() /*-{
		return this.toJSON();
	}-*/;
		
	
	/**
	 * Get the node type, which may return Stage, Layer, Group, or Node.
	 * @return node type
	 */
	public native final String getType() /*-{
		return this.getType();
	}-*/;
	
	
	/**
	 * Checks visibility of the node.
	 * determine if node is visible by taking into account ancestors. 
	 * @return True, if node is visible.
	 */
	public final native boolean isVisible() /*-{
		return this.isVisible();
	}-*/;
	
	
	/**
	 * Gets the width of the node.
	 * @return node Width of the node
	 */
	public native final double getWidth() /*-{
		if (this.width() == "auto") 
			return 0;
		else 
			return this.width();
	}-*/;
	
	
	/**
	 * Sets the width of the node. Uses bounding boxes around select nodes. 
	 * For example, to define the size of an ellipse, 
	 * you could set its width and height rather than setting the radius.
	 * @param width pixels in width
	 */
	public native final void setWidth(double width) /*-{
		this.width(width);
	}-*/;
	
	
	/**
	 * Get horizontal position relative to container.
	 * @return The horizontal position
	 */
	public final native double getX() /*-{
		return this.x();
	}-*/;

	
	/**
	 * Set horizontal position relative to container.
	 * @param v The horizontal position
	 */
	public final native void setX(double v) /*-{
		this.x(v);
	}-*/;

	
	/**
	 * Get vertical position relative to container.
	 * @param x The vertical position
	 */
	public final native double getY() /*-{
		return this.y();
	}-*/;

	
	/**
	 * Set the vertical position relative to container.
	 * @param v The vertical position
	 */
	public final native void setY(double v) /*-{
		this.y(v);
	}-*/;
	
	
	
	/**
	 * Register an event handler for a single event. 
	 * @param type A single event type to listen for.
	 * @param handler The handler.
	 */
	public final void addEventHandler(KEventTypeEnum type, KEventHandler handler) {
		addEventHandler(Arrays.asList(type), handler);
	}
	
	
	/**
	 * Register an event handler for a multitude of events.
	 * @param type List of events to listen for
	 * @param handler The handler.
	 */
	public final void addEventHandler(List<KEventTypeEnum> eventTypes, KEventHandler handler)	{
		addEventHandlers(eventListToString(eventTypes), handler);
	}
	
	
	/**
	 * Convert a list of event types to a single string, as defined by the KineticJS standard.
	 * @param eventTypes The event types
	 * @return A string of the event types
	 */
	protected final static String eventListToString(List<KEventTypeEnum> eventTypes) {
		final StringBuffer sb = new StringBuffer();
		for (KEventTypeEnum type: eventTypes) {
			sb.append(type.toNativeEvent()).append(" "); 
		}
		return sb.toString().trim();
	}
	
	
	/**
	 * Add a (possibly) multi-event handlers to the node.
	 * @param eventString The string containing events to register.
	 * @param handler The handler to execute.
	 */
	protected final native void addEventHandlers(String eventString, KEventHandler handler) /*-{
		this.on(eventString, function(evt) {
			handler.@org.michaelgorski.kinetic.events.KEventHandler::handle(Lorg/michaelgorski/kinetic/events/KineticEvent;)(evt);
		});
	}-*/;
	
	
	/**
	 * Remove an event handler from the node.
	 * @param type The event Type to stop listening to
	 */
	public final void removeEventHandler(KEventTypeEnum type) {
		removeEventHandler(Arrays.asList(type));
	}	
	
	
	/**
	 * Remove an event handler from the node.
	 * @param eventTypes A number of event types to stop listening to
	 */
	// Might be buggy in Kineticjs 	
	public final void removeEventHandler(List<KEventTypeEnum> eventTypes) {
		removeEventHandlers(eventListToString(eventTypes));
	}
	
	
	/**
	 * Remove handlers for specified events from this node.
	 * @param eventTypes A (possibly) number of event types to stop listening to
	 */
	protected final native void removeEventHandlers(String eventTypes) /*-{
		this.off(eventTypes);
	}-*/;
	
	
	/**
	 * Removes this node from its parent but doesn't destroy.
	 */
	public final native void remove() /*-{
		this.remove();
	}-*/;
	
	
	/**
	 * Get the current Z position of the node relative to the container.
	 * Node needs to belong to a layer.
	 * @return The Z position
	 */
	public final native int getZIndex() /*-{
		return this.getZIndex();
	}-*/;
	
	
	/**
	 * Sets the Z position of the node.
	 * Node needs to belong to a layer.
	 * Set zIndex relative to siblings
	 * @param z A new Z position
	 */
	public final native void setZIndex(int z) /*-{
		this.setZIndex(z);
	}-*/;
	
	
	
	
	
	
	
	
}
