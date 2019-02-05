
public class myHouse
{
    private Square background;
    private Square lawn;
    private Square wall;
    private Square garage;
    private Square gdoor;
    private Triangle ghandle;
    private Triangle groof;
    private Square windowback;
    private Square window1;
    private Square window2;
    private Square window3;
    private Square window4;
    private Square door1;
    private Square door2;
    private Circle knob;
    private Triangle roof;
    private Circle moonlight;
    private Circle moon;

    /**
     * Constructor for objects of class Picture
     */
    public myHouse()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        //background and lawn
        
        background = new Square();
        background.changeColor("magenta");
        background.moveVertical(-50);
        background.moveHorizontal(-60);
        background.changeSize(400);
        background.makeVisible();
        
        lawn = new Square();
        lawn.changeColor("green");
        lawn.moveVertical(160);
        lawn.moveHorizontal(-60);
        lawn.changeSize(400);
        lawn.makeVisible();
        
        //wall
        
        wall = new Square();
        wall.changeColor("yellow");
        wall.moveVertical(80);
        wall.moveHorizontal(-10);
        wall.changeSize(150);
        wall.makeVisible();
        
        //garage
        
        garage = new Square();
        garage.changeColor("blue");
        garage.moveVertical(110);
        garage.moveHorizontal(140);
        garage.changeSize(120);
        garage.makeVisible();
        
        gdoor = new Square();
        gdoor.changeColor("white");
        gdoor.moveVertical(160);
        gdoor.moveHorizontal(155);
        gdoor.changeSize(70);
        gdoor.makeVisible();
        
        ghandle = new Triangle();
        ghandle.changeColor("black");
        ghandle.changeSize(3, 30);
        ghandle.moveHorizontal(200);
        ghandle.moveVertical(240);
        ghandle.makeVisible();
        
        groof = new Triangle();
        groof.changeColor("red");
        groof.changeSize(40, 110);
        groof.moveHorizontal(200);
        groof.moveVertical(105);
        groof.makeVisible();
        
        //windows and front
        
       
        windowback = new Square();
        windowback.changeColor("red");
        windowback.changeSize(60);
        windowback.moveHorizontal(-5);
        windowback.moveVertical(155);
        windowback.makeVisible();

        window1 = new Square();
        window1.changeColor("white");
        window1.changeSize(20);
        window1.moveHorizontal(0);
        window1.moveVertical(160);
        window1.makeVisible();
        
        window2 = new Square();
        window2.changeColor("white");
        window2.changeSize(20);
        window2.moveHorizontal(30);
        window2.moveVertical(160);
        window2.makeVisible();
        
        window3 = new Square();
        window3.changeColor("white");
        window3.changeSize(20);
        window3.moveHorizontal(0);
        window3.moveVertical(190);
        window3.makeVisible();
        
        window4 = new Square();
        window4.changeColor("white");
        window4.changeSize(20);
        window4.moveHorizontal(30);
        window4.moveVertical(190);
        window4.makeVisible();
        
        door1 = new Square();
        door1.changeColor("magenta");
        door1.changeSize(40);
        door1.moveHorizontal(80);
        door1.moveVertical(150);
        door1.makeVisible();
        
        door2 = new Square();
        door2.changeColor("magenta");
        door2.changeSize(40);
        door2.moveHorizontal(80);
        door2.moveVertical(190);
        door2.makeVisible();
        
        knob = new Circle();
        knob.changeColor("black");
        knob.moveHorizontal(145);
        knob.moveVertical(175);
        knob.changeSize(8);
        knob.makeVisible();

        moonlight = new Circle();
        moonlight.changeColor("white");
        moonlight.moveHorizontal(90);
        moonlight.moveVertical(82);
        moonlight.changeSize(30);
        moonlight.makeVisible();
        
        roof = new Triangle();
        roof.changeColor("red");
        roof.changeSize(70, 200);
        roof.moveHorizontal(72);
        roof.moveVertical(45);
        roof.makeVisible();
        
        
        //moon and polish

        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(220);
        moon.moveVertical(-40);
        moon.changeSize(78);
        moon.makeVisible();
        
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window1.changeColor("white");
            roof.changeColor("black");
            moon.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window1.changeColor("blue");
            roof.changeColor("green");
            moon.changeColor("white");
        }
    }

}
