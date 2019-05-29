import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Enemy extends Decoration
{
    
        /**
     * Constructor
     * 
     * Called once when object is created.
     */
    Enemy(int scrollableWorldX, int scrollableWorldY)
    {
        super(scrollableWorldX, scrollableWorldY);
    }
    
    private int speed = 2;
    private int frames = 0;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation ( getX(), getY() + speed);
        frames += 1;
        if(frames == 100)
        {
            //Turn around and go back
            speed = -speed;
            frames = 0;
        }
    }    
}
