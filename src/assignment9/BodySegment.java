package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class BodySegment {

	private double x, y, size;
	
	private static Color color;
	
	
	public BodySegment(double x, double y, double size) {
		//FIXME
		
		//See ColorUtils for some color options (or choose your own)
		this.x = x; 
		
		this.y = y; 
		
		this.size = size; 
		
		this.color = ColorUtils.solidColor(); 

	}
	
	/**
	 * Draws the segment
	 */
	public void draw() {
		//FIXME
		
		StdDraw.setPenColor(color);
		
		StdDraw.filledCircle(x,y, size/2);
		
		
	}
	
	public double getX() {
		
		return x; 
	}
	
	public void setX(double x) {
		
		this.x = x; 
		
	}
	

	public double getY() {
		
		return y; 
	}
	
	public void setY(double y) {
		
		this.y = y; 
		
	}
	
}
