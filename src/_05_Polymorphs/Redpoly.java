package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class Redpoly extends Polymorph {

	public Redpoly(int x, int y, int height, int width) {
		super(x, y, height, width);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
	}

    @Override
    public void update() {
        
    }
	
}
	

