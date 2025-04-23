package assignment9;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

import edu.princeton.cs.introcs.StdDraw;

public class Snake {

	private static double SEGMENT_SIZE = 0.02;
	private static final double MOVEMENT_SIZE = SEGMENT_SIZE * 1.5;
	private LinkedList<BodySegment> segments;
	private double deltaX;
	private double deltaY;
	

	
	public Snake() {
		//FIXME - set up the segments instance variable
		
		segments = new LinkedList<>();
		
		segments.add(new BodySegment(0.5, 0.5,SEGMENT_SIZE)); 
		
		deltaX = MOVEMENT_SIZE; 
		
		deltaY = 0; 
		
		
	}
	
	public void changeDirection(int direction) {
		if(direction == 1) { //up
			deltaY = MOVEMENT_SIZE;
			deltaX = 0;
		} else if (direction == 2) { //down
			deltaY = -MOVEMENT_SIZE;
			deltaX = 0;
		} else if (direction == 3) { //left
			deltaY = 0;
			deltaX = -MOVEMENT_SIZE;
		} else if (direction == 4) { //right
			deltaY = 0;
			deltaX = MOVEMENT_SIZE;
		}
	}
	
	/**
	 * Moves the snake by updating the position of each of the segments
	 * based on the current direction of travel
	 */
	
	
	
	public void move() {
		
		double newX = segments.getFirst().getX() + deltaX;
        double newY = segments.getFirst().getY() + deltaY;

        BodySegment newHead = new BodySegment(newX, newY, SEGMENT_SIZE);
        
        segments.addFirst(newHead);
        
        segments.removeLast();
        
        //moves by updating adding new segment with changed position and deleting old segment 
    }

	
	/**
	 * Draws the snake by drawing each segment
	 */
	public void draw() {
		
		
		for ( BodySegment segment: segments ) {
			

			segment.draw();
			
		}
	}
	
	/**
	 * The snake attempts to eat the given food, growing if it does so successfully
	 * @param f the food to be eaten
	 * @return true if the snake successfully ate the food
	 */
	
	
	
	public boolean eatFood(Food f, Snake snake) {
		
		// see if they're touching 
		double headX = segments.getFirst().getX();
		
        double headY = segments.getFirst().getY();

        if (Math.hypot(headX - f.getX(), headY - f.getY()) <= SEGMENT_SIZE + Food.FOOD_SIZE) {
        	
        	// grows new segment when it eats 
        	
            segments.addLast(new BodySegment(headX, headY, SEGMENT_SIZE));
            
            return true;
        }
        
        return false;

} 
	
	public boolean eatFancyFood(FancyFood c, Snake snake) {
		
		// see if they're touching 
		double headX = segments.getFirst().getX();
		
        double headY = segments.getFirst().getY();

        if (Math.hypot(headX - c.getX(), headY - c.getY()) <= SEGMENT_SIZE + FancyFood.FOOD_SIZE) {
        	
        	// grows new segment when it eats 
        	
            segments.addLast(new BodySegment(headX, headY, SEGMENT_SIZE));
            
            segments.addLast(new BodySegment(headX, headY, SEGMENT_SIZE));
            
            return true;
        }
        
        return false;

} 

		
	
	
	/**
	 * Returns true if the head of the snake is in bounds
	 * @return whether or not the head is in the bounds of the window
	 */
	public boolean isInbounds() {
		//FIXME
		
		BodySegment head = segments.get(0);
			
		double headX = head.getX();
		double headY = head.getY();
		
		if (headX > 0 && headX < 1 && headY > 0 && headY < 1 ) {
			
		return true;
		
		}
		
		else {
			
			return false; 

			
		}
		
	
	}

}

