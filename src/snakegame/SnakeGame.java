
package snakegame;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * @author hienlong
 */
public class SnakeGame {

    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Snake");
        frame.setContentPane(new GamePanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        
        frame.setPreferredSize(new Dimension(GamePanel.WIDTH, GamePanel.HEIGHT));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
