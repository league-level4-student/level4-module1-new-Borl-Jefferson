package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class Movingmorph extends Polymorph{
boolean right = true;
	public Movingmorph(int x, int y, int height, int width) {
		super(x, y, height, width);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
	}

    @Override
    public void update() {
        if(right) {
    	x+=5;
        }
        else {
        	x-=5;
        }
        if(x>400) {
        	right=false;
        }
        if(x<150) {
        	right=true;
        }
    }
	

}
