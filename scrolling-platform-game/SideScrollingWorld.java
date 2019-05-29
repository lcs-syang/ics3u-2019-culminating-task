import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Template for a side-scrolling platform game.
 * 
 * @author R. Gordon
 * @version May 8, 2019
 */
public class SideScrollingWorld extends World
{
    /**
     * Instance variables
     * 
     * These are available for use in any method below.
     */    
    // Tile size in pixels for world elements (blocks, clouds, etc)
    // TO STUDENTS: Modify if your game's tiles have different dimensions
    private static final int TILE_SIZE = 32;
    private static final int HALF_TILE_SIZE = TILE_SIZE / 2;

    // World size constants
    // TO STUDENTS: Modify only if you're sure
    //              Should be a resolution that's a multiple of TILE_SIZE
    private static final int VISIBLE_WIDTH = 640;
    private static final int VISIBLE_HEIGHT = 480;

    // Additional useful constants based on world size
    public static final int HALF_VISIBLE_WIDTH = VISIBLE_WIDTH / 2;
    private static final int HALF_VISIBLE_HEIGHT = VISIBLE_HEIGHT / 2;

    // Defining the boundaries of the scrollable world
    // TO STUDENTS: Modify SCROLLABLE_WIDTH if you wish to have a longer level
    public static final int SCROLLABLE_WIDTH = VISIBLE_WIDTH * 3;
    private static final int SCROLLABLE_HEIGHT = VISIBLE_HEIGHT;

    // Hero
    Hero theHero;

    // Track whether game is on
    private boolean isGameOver;

    //Set timer and score
    private boolean gameOn;
    private int frames;
    private int time = 0;
    public int score = 0;

    /**
     * Constructor for objects of class SideScrollingWorld.
     */
    public SideScrollingWorld()
    {    
        // Create a new world with 640x480 cells with a cell size of 1x1 pixels.
        // Final argument of 'false' means that actors in the world are not restricted to the world boundary.
        // See: https://www.greenfoot.org/files/javadoc/greenfoot/World.html#World-int-int-int-boolean-
        super(VISIBLE_WIDTH, VISIBLE_HEIGHT, 1, false);

        // Set up the starting scene
        setup();

        // Game on
        isGameOver = false;

    }

    private void startGame()
    {
        frames = 0;
        time = 0;
        showTime();
        showScore();
    }
    
    private void showTime()
    {
        showText("Time:" + time, 100, 50);
    }
    
    

    public void trackTime()
    {
        // Track frames (fps is about 60)
        frames += 1;

        // Every second (roughly) reduce the time left
        if (frames % 60 == 0)
        {
            time += 1;
            showTime();
        }
    }
    
    public void addScore()
     {
        //
        score += 1;
    }

    public void showScore()
    {
        //Show score at the top right corner of the world
        showText("Score:" + score,550,50);
    }
    /**
     * Set up the entire world.
     */
    private void setup()
    {
        // TO STUDENTS: Add, revise, or remove methods as needed to define your own game's world
        //addLeftGround();
        //addFences();
        //addMetalPlateSteps();
        addClouds();
        addEnemy();
        //addRightGround();
        // add a metal plate
        for(int i=0; i<=3; i+=1)
        {
            //location
            int x = 10 * TILE_SIZE + HALF_TILE_SIZE;
            int y = HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=3; i+=1)
        {
            //location
            int x = 11 * TILE_SIZE + HALF_TILE_SIZE;
            int y = HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=4; i+=1)
        {
            //location
            int x = 10 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 10 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=4; i+=1)
        {
            //location
            int x = 11 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 10 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=1; i+=1)
        {
            //location
            int x = 17 * TILE_SIZE + HALF_TILE_SIZE;
            int y = HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=1; i+=1)
        {
            //location
            int x = 18 * TILE_SIZE + HALF_TILE_SIZE;
            int y = HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=7; i+=1)
        {
            //location
            int x = 17 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 7 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=7; i+=1)
        {
            //location
            int x = 18 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 7 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=3; i+=1)
        {
            //location
            int x = 24 * TILE_SIZE + HALF_TILE_SIZE;
            int y = HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=3; i+=1)
        {
            //location
            int x = 25 * TILE_SIZE + HALF_TILE_SIZE;
            int y = HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=5; i+=1)
        {
            //location
            int x = 24 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 10 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=5; i+=1)
        {
            //location
            int x = 25 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 10 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=6; i+=1)
        {
            //location
            int x = 31 * TILE_SIZE + HALF_TILE_SIZE;
            int y = HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        }

        // add a metal plate
        for(int i=0; i<=6; i+=1)
        {
            //location
            int x = 32 * TILE_SIZE + HALF_TILE_SIZE;
            int y = HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        }

        // add a metal plate
        for(int i=0; i<=1; i+=1)
        {
            //location
            int x = 31 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 13 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=1; i+=1)
        {
            //location
            int x = 32 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 13 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=1; i+=1)
        {
            //location
            int x = 42 * TILE_SIZE + HALF_TILE_SIZE;
            int y = HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=1; i+=1)
        {
            //location
            int x = 43 * TILE_SIZE + HALF_TILE_SIZE;
            int y = HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=6; i+=1)
        {
            //location
            int x = 42 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 8 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=6; i+=1)
        {
            //location
            int x = 43 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 8 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=4; i+=1)
        {
            //location
            int x = 47 * TILE_SIZE + HALF_TILE_SIZE;
            int y = HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=4; i+=1)
        {
            //location
            int x = 48 * TILE_SIZE + HALF_TILE_SIZE;
            int y = HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=5; i+=1)
        {
            //location
            int x = 47 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 10 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=5; i+=1)
        {
            //location
            int x = 48 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 10 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=2; i+=1)
        {
            //location
            int x = 52 * TILE_SIZE + HALF_TILE_SIZE;
            int y = HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=2; i+=1)
        {
            //location
            int x = 53 * TILE_SIZE + HALF_TILE_SIZE;
            int y = HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=6; i+=1)
        {
            //location
            int x = 52 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 8 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        // add a metal plate
        for(int i=0; i<=6; i+=1)
        {
            //location
            int x = 53 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 8 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;

            MetalPlate plate = new MetalPlate(x,y);
            addObject(plate, x, y);
        } 

        addHero();
    }

    /**
     * Add steps made out of metal plates leading to end of world.
     */
    private void addMetalPlateSteps()
    {
        // How many plates total?
        final int COUNT_OF_METAL_PLATES = 20;
        final int PLATES_PER_GROUP = 4;

        // Add groups of plates
        for (int i = 0; i < COUNT_OF_METAL_PLATES / PLATES_PER_GROUP; i += 1)
        {
            // Group of four metal plates all at same y position
            int y = VISIBLE_HEIGHT - HALF_TILE_SIZE * 3 - i * TILE_SIZE;

            // Add the individual plates in a given group
            for (int j = 0; j < PLATES_PER_GROUP; j += 1)
            {
                int x = VISIBLE_WIDTH + TILE_SIZE * 2 + TILE_SIZE * (i + j) + TILE_SIZE * 5 * i;
                MetalPlate plate = new MetalPlate(x, y);
                addObject(plate, x, y);
            }
        }
    }

    /**
     * Add a few clouds for the opening scene.
     */
    private void addClouds()
    {
        Cloud cloud1 = new Cloud(170, 125);
        addObject(cloud1, 170, 125);
        Cloud cloud2 = new Cloud(450, 175);
        addObject(cloud2, 450, 175);
        Cloud cloud3 = new Cloud(775, 50);
        addObject(cloud3, 775, 50);
    }

    /**
     * Act
     * 
     * This method is called approximately 60 times per second.
     */
    public void act()
    {
        trackTime();
        showScore();
        addCoin();
    }

    /**
     * Add the hero to the world.
     */
    private void addHero()
    {
        // Initial horizontal position
        int initialX = TILE_SIZE;

        // Instantiate the hero object
        theHero = new Hero(initialX);

        // Add hero in bottom left corner of screen
        addObject(theHero, initialX, 8 * TILE_SIZE);
    }

    private void addEnemy()
    //New Enemy
    {
        Enemy enemy = new Enemy(1200, 100);
        addObject(enemy, 1200, 100);
    }

    //New Enemy
    {
        Enemy enemy = new Enemy(130, 100);
        addObject(enemy, 130, 100);
    }
    
    private void addCoin()
    //
    {
       Coin coin = new Coin(120,100);
       addObject(coin, 120, 100); 
    }
    

    /**
     * Return an object reference to the hero.
     */
    public Hero getHero()
    {
        return theHero;
    }

    /**
     * Set game over
     */
    public void setGameOver()
    {
        isGameOver = true;
    }

}

