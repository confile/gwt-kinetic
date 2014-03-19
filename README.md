gwt-kinetic
===========

A thin [GWT](http://www.gwtproject.org/) wrapper for the [kinetic.js](http://www.kineticjs.com/) library.

This library is based on kinetic 5.x. It is an extension of [KineticGWT](https://github.com/neothemachine/KineticGWT).


If you are interested in this lib you can contact me: confilem (at) googlemail (dot) com


## How it works!


Include the following line in before </head> of your static html file which hosts the GWT page.

    <script src="http://d3lp1msu2r81bx.cloudfront.net/kjs/js/lib/kinetic-v5.0.1.min.js"></script>


In your Java Code: 

    // Kinetic needs a special div in the DOM
    Element div = DOM.createDiv();
    RootPanel.getBodyElement().appendChild(div);
    
    // Setup stage
    KStage stage = Kinetic.createStage(div, 400, 400);
    KLayer layer = Kinetic.createLayer();
    stage.add(layer);
    
    KText text = Kinetic.createText("hello world"); 
    layer.add(text);
    stage.draw();
  
