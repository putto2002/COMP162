import javax.swing.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new ShapePanel());
        frame.pack();
        frame.setVisible(true);
    }
    
}