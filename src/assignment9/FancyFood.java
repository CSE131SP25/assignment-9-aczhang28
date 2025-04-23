package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class FancyFood extends Food {
	
	

	    public FancyFood() {
	    	
	        super(); 
	        
	     }

	    @Override 
	    
	    public void draw() {
			
			StdDraw.setPenColor(Color.BLACK);
			
			StdDraw.filledCircle(this.getX(),this.getY(), FOOD_SIZE/2);
			
			
		}
	
	}

