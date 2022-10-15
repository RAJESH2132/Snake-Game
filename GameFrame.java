import java.awt.Color;
import javax.swing.JFrame;

public class GameFrame extends JFrame{
    GameFrame(){GamePanel panel = new GamePanel();
        panel.setBackground(Color.black);
        add(panel);
        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
        //to appear window in middle of screen
        setLocationRelativeTo(null);
    }
    
}
