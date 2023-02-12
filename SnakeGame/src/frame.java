import javax.swing.*;

public class frame extends JFrame {
    frame(){
        this.add(new panel());
        this.setTitle("SnakeGame");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
    }
}
