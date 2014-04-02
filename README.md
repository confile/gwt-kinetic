gwt-kinetic
===========

A thin [GWT](http://www.gwtproject.org/) wrapper for the [kinetic.js](http://www.kineticjs.com/) library.

This library is based on kinetic 5.x. It is an extension of [KineticGWT](https://github.com/neothemachine/KineticGWT).

##Current Release
1.3

##Current Snapshot
1.4-SNAPSHOT

## How it works!


Include the following line in before </head> of your static html file which hosts the GWT page.

    <script src="http://d3lp1msu2r81bx.cloudfront.net/kjs/js/lib/kinetic-v5.1.0.min.js"></script>

In your module gwt.xml file: 

    <inherits name="org.michaelgorski.gwt-kinetic"/>

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
  
  
Shapes and Elements supported from Kinetic.js: 

- Circle
- Group
- Layer
- FastLayer
- Stage
- Image
- Line
- Node
- Rect
- Shape
- Text
- RegularPolygon


More features upon request or if you make a pul request. 

#### Using events

    shape.addEventHandler(EventTypeTouch.TAP, new KEventHandler() {
			
			@Override
			public void handle(KineticEvent event) {

            }
    }

If you are interested in this lib you can contact me: confilem (at) googlemail (dot) com
