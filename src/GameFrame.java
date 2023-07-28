import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePannel());
        this.setTitle("Virus pe ma ta");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
