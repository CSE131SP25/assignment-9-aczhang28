package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Food {

	public static final double FOOD_SIZE = 0.02;
	
	private Color color; 
	
	private double x, y;
	
	private int count; 
	
	
	public Food () {
		
		this.count = 0; 
		
		randomSpot(); 
		
		this.color = ColorUtils.solidColor(); 
	}
	/**
	 * Creates a new Food at a random location
	 */
	
	public void randomSpot() {
		
		this.x = Math.random();
		 
		this.y = Math.random() ;
		
		count ++;
	}
	
	public int getCount() {
		
		return this.count; 
	}
	/**
	 * Draws the Food
	 */
	
	public void draw() {
		
		StdDraw.setPenColor(color);
		
		StdDraw.filledCircle(x,y, FOOD_SIZE/2);
		
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
