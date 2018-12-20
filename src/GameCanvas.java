import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel {
    Player player;
    Background background;


    public GameCanvas() {
        this.background = new Background();
        this.player = new Player();
    }

    public void run() {
            long lastTime = 0;
            long delay = 1000/60;
            while(true) {
            long currentTime = System.currentTimeMillis();
                if((currentTime - lastTime) >= delay) {
                    background.run();
                    player.run();
                    this.repaint(); //== paint }

                    lastTime = currentTime;
                }
            }
        }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0,0,800,600);
        this.background.render(g);
        this.player.render(g);

    }
}
