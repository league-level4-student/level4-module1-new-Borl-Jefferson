package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    int width;
    int height;
    
    public Polymorph(int x, int y, int height, int width){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height= height;
    }
    
    public int getw() {
    	return width;
    }
    public void setw(int x) {
    	width = x;
    }
    
public int geth() {
    	return height;
    }
    public void seth(int x) {
    	height = x;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
