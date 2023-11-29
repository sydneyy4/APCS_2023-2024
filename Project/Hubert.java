import processing.core.*;

public class Hubert
{
	public Hubert(PApplet p, PVector position, PVector velocity, float radius, int c)
    {
        this.p = p;
        this.position = position.copy();
        this.velocity = velocity.copy();
        this.radius = radius;
        this.c = c;
    }

    public void display()
    {
       
    }
    
    private PApplet p;
    private PVector position;
    private PVector velocity;
    private float radius;
    private int c;
}

