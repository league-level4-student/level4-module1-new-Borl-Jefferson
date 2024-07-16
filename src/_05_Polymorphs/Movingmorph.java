package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class Movingmorph extends Polymorph{
boolean right = true;
	public Movingmorph(int x, int y, int height, int width) {
		super(x, y, height, width);
	}
	int px = 0;
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
	}

    @Override
    public void update() {
        if(right) {
    	px+=5;
        }
        else {
        	px-=5;
        }
        if(px>400) {
        	right=false;
        }
        if(px<150) {
        	right=true;
        }
        x=px;
    }
   public int getpx() {
	   return px;
   }
	

}
