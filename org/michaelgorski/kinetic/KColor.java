package org.michaelgorski.kinetic;

import java.io.Serializable;


/**
 * A RGBA colour value.
 * Used for defining all sorts of colours using red, green, blue and alpha (opacity) components.
 * @author Ed
 */
public class KColor implements Serializable {

	   private static final long serialVersionUID = 1L;
	    
	    public static final KColor aliceblue 		= new KColor(240,248,255);
		public static final KColor antiquewhite		= new KColor(250,235,215);
		public static final KColor aqua    			= new KColor(  0,255,255);
		public static final KColor aquamarine		= new KColor(127,255,212);
		public static final KColor azure   			= new KColor(240,255,255);
		public static final KColor beige   			= new KColor(245,245,220);
		public static final KColor bisque  			= new KColor(255,228,196);
		public static final KColor black   			= new KColor(  0,  0,  0);
		public static final KColor blanchedalmond	= new KColor(255,235,205);
		public static final KColor blue    			= new KColor(  0,  0,255);
		public static final KColor blueviolet		= new KColor(138, 43,226);
		public static final KColor brown   			= new KColor(165, 42, 42);
		public static final KColor burlywood 		= new KColor(222,184,135);
		public static final KColor cadetblue 		= new KColor( 95,158,160);
		public static final KColor chartreuse		= new KColor(127,255,  0);
		public static final KColor chocolate 		= new KColor(210,105, 30);
		public static final KColor coral   			= new KColor(255,127, 80);
		public static final KColor cornflowerblue	= new KColor(100,149,237);
		public static final KColor cornsilk			= new KColor(255,248,220);
		public static final KColor crimson 			= new KColor(220, 20, 60);
		public static final KColor darkblue			= new KColor(  0,  0,139);
		public static final KColor darkcyan			= new KColor(  0,139,139);
		public static final KColor darkgoldenrod	= new KColor(184,134, 11);
		public static final KColor darkgray			= new KColor(169,169,169);
		public static final KColor darkgreen 		= new KColor(  0,100,  0);
		public static final KColor darkkhaki 		= new KColor(189,183,107);
		public static final KColor darkmagenta 		= new KColor(139,  0,139);
		public static final KColor darkolivegreen	= new KColor( 85,107, 47);
		public static final KColor darkorange		= new KColor(255,140,  0);
		public static final KColor darkorchid		= new KColor(153, 50,204);
		public static final KColor darkred 			= new KColor(139,  0,  0);
		public static final KColor darksalmon		= new KColor(233,150,122);
		public static final KColor darkseagreen		= new KColor(143,188,143);
		public static final KColor darkslateblue	= new KColor( 72, 61,139);
		public static final KColor darkslategray	= new KColor( 47, 79, 79);
		public static final KColor darkturquoise	= new KColor(  0,206,209);
		public static final KColor darkviolet		= new KColor(148,  0,211);
		public static final KColor deeppink			= new KColor(255, 20,147);
		public static final KColor deepskyblue 		= new KColor(  0,191,255);
		public static final KColor dimgray 			= new KColor(105,105,105);
		public static final KColor dodgerblue		= new KColor( 30,144,255);
		public static final KColor firebrick 		= new KColor(178, 34, 34);
		public static final KColor floralwhite 		= new KColor(255,250,240);
		public static final KColor forestgreen 		= new KColor( 34,139, 34);
		public static final KColor fuchsia 			= new KColor(255,  0,255);
		public static final KColor gainsboro 		= new KColor(220,220,220);
		public static final KColor ghostwhite		= new KColor(248,248,255);
		public static final KColor gold    			= new KColor(255,215,  0);
		public static final KColor goldenrod 		= new KColor(218,165, 32);
		public static final KColor gray    			= new KColor(128,128,128);
		public static final KColor green   			= new KColor(  0,128,  0);
		public static final KColor greenyellow 		= new KColor(173,255, 47);
		public static final KColor honeydew			= new KColor(240,255,240);
		public static final KColor hotpink 			= new KColor(255,105,180);
		public static final KColor indianred 		= new KColor(205, 92, 92);
		public static final KColor indigo  			= new KColor( 75,  0,130);
		public static final KColor ivory   			= new KColor(255,255,240);
		public static final KColor khaki   			= new KColor(240,230,140);
		public static final KColor lavender			= new KColor(230,230,250);
		public static final KColor lavenderblush	= new KColor(255,240,245);
		public static final KColor lawngreen 		= new KColor(124,252,  0);
		public static final KColor lemonchiffon		= new KColor(255,250,205);
		public static final KColor lightblue 		= new KColor(173,216,230);
		public static final KColor lightcoral		= new KColor(240,128,128);
		public static final KColor lightcyan 		= new KColor(224,255,255);
		public static final KColor lightgoldenrodyellow= new KColor(250,250,210);
		public static final KColor lightgreen		= new KColor(144,238,144);
		public static final KColor lightgrey		= new KColor(211,211,211);
		public static final KColor lightpink 		= new KColor(255,182,193);
		public static final KColor lightsalmon	 	= new KColor(255,160,122);
		public static final KColor lightseagreen	= new KColor( 32,178,170);
		public static final KColor lightskyblue		= new KColor(135,206,250);
		public static final KColor lightslategray	= new KColor(119,136,153);
		public static final KColor lightsteelblue	= new KColor(176,196,222);
		public static final KColor lightyellow 		= new KColor(255,255,224);
		public static final KColor lime    			= new KColor(  0,255,  0);
		public static final KColor limegreen 		= new KColor( 50,205, 50);
		public static final KColor linen   			= new KColor(250,240,230);
		public static final KColor maroon  			= new KColor(128,  0,  0);
		public static final KColor mediumaquamarine	= new KColor(102,205,170);
		public static final KColor mediumblue		= new KColor(  0,  0,205);
		public static final KColor mediumorchid		= new KColor(186, 85,211);
		public static final KColor mediumpurple		= new KColor(147,112,219);
		public static final KColor mediumseagreen	= new KColor( 60,179,113);
		public static final KColor mediumslateblue	= new KColor(123,104,238);
		public static final KColor mediumspringgreen= new KColor(  0,250,154);
		public static final KColor mediumturquoise	= new KColor( 72,209,204);
		public static final KColor mediumvioletred	= new KColor(199, 21,133);
		public static final KColor midnightblue		= new KColor( 25, 25,112);
		public static final KColor mintcream 		= new KColor(245,255,250);
		public static final KColor mistyrose 		= new KColor(255,228,225);
		public static final KColor moccasin			= new KColor(255,228,181);
		public static final KColor navajowhite 		= new KColor(255,222,173);
		public static final KColor navy    			= new KColor(  0,  0,128);
		public static final KColor oldlace 			= new KColor(253,245,230);
		public static final KColor olive   			= new KColor(128,128,  0);
		public static final KColor olivedrab 		= new KColor(107,142, 35);
		public static final KColor orange  			= new KColor(255,165,  0);
		public static final KColor orangered 		= new KColor(255, 69,  0);
		public static final KColor orchid  			= new KColor(218,112,214);
		public static final KColor palegoldenrod	= new KColor(238,232,170);
		public static final KColor palegreen 		= new KColor(152,251,152);
		public static final KColor paleturquoise	= new KColor(175,238,238);
		public static final KColor palevioletred	= new KColor(219,112,147);
		public static final KColor papayawhip		= new KColor(255,239,213);
		public static final KColor peachpuff 		= new KColor(255,218,185);
		public static final KColor peru    			= new KColor(205,133, 63);
		public static final KColor pink    			= new KColor(255,192,203);
		public static final KColor plum    			= new KColor(221,160,221);
		public static final KColor powderblue		= new KColor(176,224,230);
		public static final KColor purple  			= new KColor(128,  0,128);
		public static final KColor red     			= new KColor(255,  0,  0);
		public static final KColor rosybrown 		= new KColor(188,143,143);
		public static final KColor royalblue 		= new KColor( 65,105,225);
		public static final KColor saddlebrown 		= new KColor(139, 69, 19);
		public static final KColor salmon  			= new KColor(250,128,114);
		public static final KColor sandybrown		= new KColor(244,164, 96);
		public static final KColor seagreen			= new KColor( 46,139, 87);
		public static final KColor seashell			= new KColor(255,245,238);
		public static final KColor sienna  			= new KColor(160, 82, 45);
		public static final KColor silver  			= new KColor(192,192,192);
		public static final KColor skyblue 			= new KColor(135,206,235);
		public static final KColor slateblue 		= new KColor(106, 90,205);
		public static final KColor slategray 		= new KColor(112,128,144);
		public static final KColor snow    			= new KColor(255,250,250);
		public static final KColor springgreen	 	= new KColor(  0,255,127);
		public static final KColor steelblue 		= new KColor( 70,130,180);
		public static final KColor tan     			= new KColor(210,180,140);
		public static final KColor teal    			= new KColor(  0,128,128);
		public static final KColor thistle 			= new KColor(216,191,216);
		public static final KColor tomato  			= new KColor(255, 99, 71);
		public static final KColor turquoise 		= new KColor( 64,224,208);
		public static final KColor violet  			= new KColor(238,130,238);
		public static final KColor wheat   			= new KColor(245,222,179);
		public static final KColor white   			= new KColor(255,255,255);
		public static final KColor whitesmoke		= new KColor(245,245,245);
		public static final KColor yellow  			= new KColor(255,255,  0);
		public static final KColor yellowgreen	 	= new KColor(154,205, 50);
			
		public static final KColor fubGreen			= new KColor(169,208, 39);
		public static final KColor fubBlue			= new KColor(  0, 51,102);
		public static final KColor fubLightBlue		= new KColor(161,155,255);
		public static final KColor quicksilver		= new KColor(230,230,230);
		
		/** The separate red component */
		private int redComponent;
		
		/** The separate green component */
		private int greenComponent;
		
		/** The separate blue component */
		private int blueComponent;
		
		/** The separate alpha component */
		// Changed this one to float (issue #15 - raised by madgenius)
		private float alphaComponent;
		
		/**
		 * Retrieve the red component.
		 * @return The red value
		 */
		public int getRed() {
			return redComponent;
		}

		/**
		 * Set the red component.
		 * @param red The new value
		 */
		public void setRed(int red) {
			if (red > 255) this.redComponent = 255; else if (red < 0) this.redComponent = 0; else this.redComponent =red;
		}

		/**
		 * Retrieve the green component.
		 * @return The green value
		 */
		public int getGreen() {
			return greenComponent;
		}

		/**
		 * Set the green component.
		 * @param green The new value
		 */
		public void setGreen(int green) {
			if (green > 255) this.greenComponent = 255; else if (green < 0) this.greenComponent = 0; else this.greenComponent = green;
		}

		/**
		 * Retrieve the blue component.
		 * @return The blue value
		 */
		public int getBlue() {
			return blueComponent;
		}

		/**
		 * Set the blue component.
		 * @param blue The new value
		 */
		public void setBlue(int blue) {
			if (blue > 255) this.blueComponent = 255; else if (blue < 0) this.blueComponent = 0; else this.blueComponent = blue;	
		}

		/**
		 * Retrieve the alpha component.
		 * @return The alpha value
		 */
		public float getAlpha() {
			return alphaComponent;
		}

		/**
		 * Set the alpha component.
		 * @param alpha The new value
		 */
		public void setAlpha(float alpha) {
			this.alphaComponent = alpha;
		}
		
		/**
		 * Retrieve a Color with an alpha value.
		 * @param alpha Defines the transparency (0.0 is completely transparent and 1.0 is opaque)
		 * @return a translucent Color
		 */
		public KColor alpha(float alpha) {
			return new KColor(this.redComponent, this.greenComponent, this.blueComponent, alpha);
		}
		
		/** 
		 * Parametrized Ctor.
		 * Alpha is set to 255;
		 * @param red Red component (0..255)
		 * @param green Green component (0..255)
		 * @param blue Blue component (0..255)
		 */
		public KColor(int red, int green, int blue) {
			this.redComponent = red;
			this.greenComponent = green;
			this.blueComponent = blue;
			this.alphaComponent = 255;
			if (red > 255) this.redComponent = 255; else if (red < 0) this.redComponent = 0;
			if (green > 255) this.greenComponent = 255; else if (green < 0) this.greenComponent = 0;
			if (blue > 255) this.blueComponent = 255; else if (blue < 0) this.blueComponent = 0;		
		}

		/** 
		 * Parametrized Ctor with separate components.
		 * @param red Red component (0..255)
		 * @param green Green component (0..255)
		 * @param blue Blue component (0..255)
		 * @param alpha Alpha component (0.0 .. 1.0)
		 */
		public KColor(int red, int green, int blue, float alpha) {
			this.redComponent = red;
			this.greenComponent = green;
			this.blueComponent = blue;
			this.alphaComponent = alpha;
			if (red > 255) this.redComponent = 255; else if (red < 0) this.redComponent = 0;
			if (green > 255) this.greenComponent = 255; else if (green < 0) this.greenComponent = 0;
			if (blue > 255) this.blueComponent = 255; else if (blue < 0) this.blueComponent = 0;	
			if (alpha > 1.0f) this.alphaComponent = 1.0f; else if (alpha < 0.0f) this.alphaComponent = 0.0f;	
		}

		/**
		 * Parametrized Ctor from a single webColor string.
		 * @param webColor A Color string (e.g., '#FF0000') or an rgba string, for example 'rgba(255, 0, 0, 0.5)'
		 */
		public KColor(final String webColor) {
			
			if (webColor.startsWith("#")) {
			
				// This is a web Color a la #RRGGBB
				
				redComponent = Integer.parseInt(webColor.substring(1, 3), 16);
				if (redComponent > 255) redComponent = 255; else if (redComponent < 0) redComponent = 0;
				
				greenComponent = Integer.parseInt(webColor.substring(3, 5), 16);
				if (greenComponent > 255) greenComponent = 255; else if (greenComponent < 0) greenComponent = 0;
				
				blueComponent = Integer.parseInt(webColor.substring(5, 7), 16);
				if (blueComponent > 255) blueComponent = 255; else if (blueComponent < 0) blueComponent = 0;
				
				alphaComponent = 255;
				
			} else if (webColor.startsWith("rgba")) {
				
				// This is a RGBA quadruple
				int pos = webColor.indexOf(",", 0);
				redComponent = Integer.parseInt(webColor.substring(5, pos));
				if (redComponent > 255) redComponent = 255; else if (redComponent < 0) redComponent = 0;
				int oldPos = pos;
				
				pos = webColor.indexOf(",", pos+1);
				greenComponent = Integer.parseInt(webColor.substring(oldPos+1, pos));
				if (greenComponent > 255) greenComponent = 255; else if (greenComponent < 0) greenComponent = 0;
				oldPos = pos;
				
				pos = webColor.indexOf(",", pos+1);
				blueComponent = Integer.parseInt(webColor.substring(oldPos+1, pos));
				if (blueComponent > 255) blueComponent = 255; else if (blueComponent < 0) blueComponent = 0;
				oldPos = pos;
				
				pos = webColor.indexOf(")", pos+1);
				alphaComponent = Float.parseFloat(webColor.substring(oldPos+1, pos));
				if (alphaComponent > 1.0f) alphaComponent = 1.0f; else if (alphaComponent < 0.0f) alphaComponent = 0.0f;
				oldPos = pos;
				
			} 
			else {
				// This is a Color name
				final KColor col = KColorPalette.valueOf(webColor).opaque();
				this.redComponent = col.redComponent;
				this.greenComponent = col.greenComponent;
				this.blueComponent = col.blueComponent;
				this.alphaComponent = col.alphaComponent;
			}
		}	
		
		/**
		 * Create a web Color code (#RRGGBB) from the three separate RGB components.
		 * @return A web Color code
		 */
		public String toRGBString() {
			// This code could become more elegant by using String.format 
			// Unfortunately, GWT does not support it.
			final StringBuilder sb = new StringBuilder("#");
			sb.append(redComponent < 16? "0":"").append(Integer.toHexString(redComponent));
			sb.append(greenComponent < 16? "0":"").append(Integer.toHexString(greenComponent));
			sb.append(blueComponent < 16? "0":"").append(Integer.toHexString(blueComponent));
			return sb.toString();
		}
		
		/**
		 * Create RGBA quadruple from the four separate RGBA components.
		 * @return A RGBA quadruple
		 */
		@Override
		public String toString() {
			return new StringBuilder("rgba(").append(redComponent).append(",").append(greenComponent).append(",").append(blueComponent).append(",").append(alphaComponent).append(")").toString();
		}
	
	
}
