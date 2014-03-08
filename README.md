gwt-kinetic
===========

A thin [GWT](http://www.gwtproject.org/) wrapper for the [kinetic.js](http://www.kineticjs.com/) library.

This library is based on kinetic 5.x. It is an extension of [KineticGWT](https://github.com/neothemachine/KineticGWT).


## How it works!

    // Kinetic needs a special div in the DOM
    Element div = DOM.createDiv();
    RootPanel.getBodyElement().appendChild(div);
    
    // Setup stage
    Stage stage = Kinetic.createStage(div, 400, 400);
    Layer layer = Kinetic.createLayer();
    stage.add(layer);
    
    Rectangle c = Kinetic.createRectangle(new Box2d(10, 10, 200, 200)); 
    layer.add(c);
    stage.draw();
  
