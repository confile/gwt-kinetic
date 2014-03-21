package org.michaelgorski.kinetic.events;


/**
 * Can be used with any node except stage. Touch device events only.
 */
public enum EventTypeTouch implements KEventTypeEnum {
	TOUCHSTART,
	TOUCHMOVE,
	TOUCHEND,
	TAP,
	DBLTAP,
	DRAGSTART,
	DRAGMOVE,
	DRAGEND;

	@Override
	public String toNativeEvent() {
		return this.toString().toLowerCase();
	}
}
