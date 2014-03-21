package org.michaelgorski.kinetic.events;


/**
 * Can be used with any node except stage.
 * @author Ed
 */
public enum EventTypeScale implements KEventTypeEnum {
	scaleXChange, 
	scaleYChange;
		
	@Override
	public String toNativeEvent() {
		return this.toString();
	}
}


