import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background {
    BufferedImage image;
    int x;
    int y;
    public Background() {
        this.image = SpriteUtils.loadImage("assets/images/background/0.png");
        this.x = 0;
        this.y = 600 - this.image.getHeight();
    }

    public void run() {
        if(this.y < 0) { //Background run
            this.y+=10;
        }
        else {
            this.y = 0;
        }
    }

    public void render (Graphics g) {
        g.drawImage(this.image,this.x,this.y,null); //Background render
    }
}
