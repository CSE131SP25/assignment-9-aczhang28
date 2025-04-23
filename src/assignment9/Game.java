package assignment9;

import java.awt.Color;
import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class Game {
	
	private Snake snake;
	
	private Food food;
	
	private FancyFood fancyfood; 
	
public Game() {
		
		
		StdDraw.enableDoubleBuffering();
		
		//FIXME - construct new Snake and Food objects
		
		snake = new Snake ();
		food = new Food ();
		fancyfood = new FancyFood();
	}
	
	public void play() {
		
		while (snake.isInbounds()) { //TODO: Update this condition to check if snake is in bounds
			
			
			int dir = getKeypress();
			
			/*
			 * 1. Pass direction to your snake
			 * 2. Tell the snake to move
			 * 3. If the food has been eaten, make a new one
			 * 4. Update the drawing
			 */
			if (dir!= -1) {// when direction = -1, that means no key is pressed 
		
			snake.changeDirection(dir);
			
			}
			
			
			snake.move();
			
			if (snake.eatFood(food, snake) ) {
				
			food.randomSpot();
			
			}	
			
			if (snake.eatFancyFood(fancyfood, snake) ) {
				
				fancyfood.randomSpot();
				
				}
			

            updateDrawing();
            StdDraw.pause(50);

		}		
		
	}
	
	
	
	private int getKeypress() {
		if(StdDraw.isKeyPressed(KeyEvent.VK_W)) {
			return 1;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_S)) {
			return 2;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_A)) {
			return 3;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_D)) {
			return 4;
		} else {
			return -1;
		}
	}
	
	
	/**
	 * Clears the screen, draws the snake and food, pauses, and shows the content
	 */
	private void updateDrawing() {
		//FIXME
		
		/*
		 * 1. Clear screen
		 * 2. Draw snake and food
		 * 3. Pause (50 ms is good)
		 * 4. Show
		 */
		
		StdDraw.clear();
		snake.draw();
		food.draw();
		fancyfood.draw();
		StdDraw.setPenColor(ColorUtils.solidColor());
		StdDraw.text(0.2, 0.7, "Score: " + food.getCount());
		StdDraw.pause(50);
		StdDraw.show();
	}
	
	public static void main(String[] args) {
		
		Game g = new Game();
		g.play();
		
	}
}
