import java.awt.*;
import java.util.ArrayList;


import javax.swing.*;
import java.awt.event.*;
public class ShapePanel extends JPanel{
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    private JPanel controlPanel = new JPanel();
    private JButton addShape = new JButton("Add Shape");
    private JTextField showNum = new JTextField(2);
    private JLabel countLabel = new JLabel("Count:");
    public JPanel shapePanel;
    private final int WIDTH = 510;
    private final int HEIGHT = 410;
    Shape shape = new Shape();

    public ShapePanel() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // control panel
        controlPanel.setPreferredSize(new Dimension(100, 400));
        ButtonListener bL = new ButtonListener();
        addShape.addActionListener(bL);
        controlPanel.add(addShape);
        controlPanel.add(countLabel);
        controlPanel.add(showNum);
        this.add(controlPanel);
        



        //DrawingPanel
        this.add(new DrawingPanel());


    }

    private class DrawingPanel extends JPanel{
        public DrawingPanel() {
            this.setPreferredSize(new Dimension(400, 400));
            this.setBackground(Color.pink);

        }

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            for(Shape shape: shapes){
                shape.display(g);
            }
            
        }

    }

    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource() == addShape){
                shapes.add(new Shape());
                showNum.setText(Integer.toString(shapes.size()));
                repaint();
            }
            
            

        }
    }
    


}