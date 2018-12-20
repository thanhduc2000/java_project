import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player {
    BufferedImage image;//no static
    static String playerName = "Hello";
    Vector2D position;
    Background background;
    public Player() {
        this.image = SpriteUtils.loadImage("assets/images/players/straight/0.png");
        this.position = new Vector2D(200,400);
    }
    public void run() {

            if (GameWindow.isUpPress) {
                //this.position.y --;
                this.position.addThis(0, -1);
            }
            if (GameWindow.isDownPress) {
                this.position.addThis(0, 1);
            }
            if (GameWindow.isLeftPress) {
                this.position.addThis(-1, 0);
            }
            if (GameWindow.isRightPress) {
                this.position.addThis(1, 0);
            }
            if(GameWindow.isUpPress && GameWindow.isLeftPress) {
                this.position.addThis((float)-Math.sqrt(2)/2,(float)-Math.sqrt(2)/2);
            }
            if(GameWindow.isUpPress && GameWindow.isRightPress) {
                this.position.addThis((float)Math.sqrt(2)/2,(float)-Math.sqrt(2)/2);
            }
            if(GameWindow.isDownPress && GameWindow.isLeftPress) {
                this.position.addThis((float)-Math.sqrt(2)/2,(float)Math.sqrt(2)/2);
            }
            if(GameWindow.isDownPress && GameWindow.isRightPress) {
                this.position.addThis((float)Math.sqrt(2)/2,(float)Math.sqrt(2)/2);
            }

        if(this.position.x > this.background.image.getWidth() - this.image.getWidth()) {
            this.position = new Vector2D(this.background.image.getWidth() - this.image.getWidth(),this.position.y);
        }
        else if(this.position.x < 0) {
            this.position = new Vector2D(0,this.position.y);
        }
        if(this.position.y > this.background.image.getHeight() - this.image.getHeight()) {
            this.position = new Vector2D(this.position.x,this.background.image.getHeight() - this.image.getHeight());
        }
        else if(this.position.y < 0) {
            this.position = new Vector2D(this.position.x,0);
        }
    }

    public void render (Graphics g) {
        g.drawImage(this.image,(int)this.position.x,(int)this.position.y,null); //Player render
    }
}
