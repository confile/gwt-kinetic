package org.michaelgorski.kinetic.events;


/**
 * Can be used with any node except stage.
 * @author Ed
 */
public enum EventTypeBasic implements KEventTypeEnum {
	MOUSEOVER, 
	MOUSEOUT, 
	MOUSEENTER, 
	MOUSELEAVE, 
	MOUSEMOVE, 
	MOUSEDOWN, 
	MOUSEUP, 
	CLICK, 
	DBLCLICK, 
	DRAGSTART,
	DRAGMOVE,
	DRAGEND;
		
	@Override
	public String toNativeEvent() {
		return this.toString().toLowerCase();
	}
}


