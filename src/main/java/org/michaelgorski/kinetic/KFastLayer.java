package org.michaelgorski.kinetic;


/**
 * FastLayer for ultra fast rendering. If you don't need node nesting, 
* mouse and touch interactions, or event pub/sub, you should use FastLayer 
* instead of Layer to create your layers. It renders about 2x faster than normal layers.
 * @author Michael Gorski
 *
 */
public class KFastLayer extends KContainer {

	protected KFastLayer() {}
	
}
