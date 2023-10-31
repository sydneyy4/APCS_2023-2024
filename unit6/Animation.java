import processing.core.*;
import java.util.*;

public class Animation extends PApplet{
	public void settings(){
		size (800,800);
	}
	public void setup(){
		PVector position = new PVector (width/2, height/2);
		PVector velocity = new PVector (3, 3);
	 	j = new Thing(this, position, velocity, 20, 230);
	}
	public void draw(){
		background(0);
		j.display();
	}

	private Thing j;

	public static void main(String[] args)
    {
        PApplet.main("Animation");

    }
}