import processing.core.*;

public class Thing{
	private PApplet p;
	private PVector position;
	private PVector velocity;
	private float radius;
	private int c;

	public Thing(PApplet p, PVector position, PVector velocity, float radius, int c){
		this.p = p;
        this.position = position.copy();
        this.velocity = velocity.copy();
        this.radius = radius;
        this.c = c;
	}
	public void check(){

	}

	public void display(){
		p.fill(c);
		p.noStroke();
		p.ellipse(position.x, position.y, radius*2, radius*2);

		position.add(velocity);

		if (position.y < radius || position.y > p.height-radius)
            velocity.y *= -1;
        	velocity.x *= -1;
	}
}