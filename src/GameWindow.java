import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameWindow extends JFrame {
        public static boolean isUpPress;
        public static boolean isDownPress;
        public static boolean isLeftPress;
        public static boolean isRightPress;

        GameCanvas canvas;
        public GameWindow() {

        this.setSize(800,600);
        this.setTitle("Game Touhou");
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.canvas = new GameCanvas();
        this.add(canvas);
        this.setupEventListener();

        this.setVisible(true);
    }

        private void setupEventListener() {
                this.addKeyListener (new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                                if(e.getKeyCode() == KeyEvent.VK_W) {
                                        GameWindow.isUpPress = true;
                                }
                                if(e.getKeyCode() == KeyEvent.VK_S) {
                                        GameWindow.isUpPress = true;
                                }
                                if(e.getKeyCode() == KeyEvent.VK_A) {
                                        GameWindow.isUpPress = true;
                                }
                                if(e.getKeyCode() == KeyEvent.VK_D) {
                                        GameWindow.isUpPress = true;
                                }

                        }

                        @Override
                        public void keyReleased(KeyEvent e) {
                                if(e.getKeyCode() == KeyEvent.VK_W) {
                                        GameWindow.isUpPress = false;
                                }
                                if(e.getKeyCode() == KeyEvent.VK_S) {
                                        GameWindow.isDownPress = false;
                                }
                                if(e.getKeyCode() == KeyEvent.VK_A) {
                                        GameWindow.isLeftPress = false;
                                }
                                if(e.getKeyCode() == KeyEvent.VK_D) {
                                        GameWindow.isRightPress = false;
                                }
                        }
                });
        }
}
