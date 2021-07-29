package shapeApp;
/** 
* The panel containing all the component of the app subclasses JPanel
* @author Put Suthisrisinlpa
* @see Person
* @version 1.0, 2021
 */
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.Timer;
public class ShapePanel extends JPanel{
   private ArrayList<Shape> shapes = new ArrayList<Shape>();
   private JPanel controlPanel = new JPanel();
   private JButton [] buttons = {new JButton("Circle"), new JButton("Square"), new JButton("Oval"), new JButton("Smiley"), new JButton("Swirl"), new JButton("Start"), new JButton("Stop")};
   private JTextField showNum = new JTextField(2);
   private JLabel countLabel = new JLabel("Count:");
   public JPanel shapePanel;
   private final int WIDTH = 510;
   private final int HEIGHT = 410;

   Timer timer;
   private final int DELAY = 10;
   
   /**  Contructor for shapePanel*/
   public ShapePanel() {
      this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    
      controlPanel.setPreferredSize(new Dimension(100, 400));
      ButtonListener bL = new ButtonListener();
      controlPanel.add(countLabel);
      controlPanel.add(showNum);
      this.add(controlPanel);
      
      for(JButton button: buttons){
         button.addActionListener(bL);
         controlPanel.add(button);
      }
            
      timer = new Timer(DELAY, bL);
      this.add(new DrawingPanel());
   }
   
   /** DrawingPanel subclasses JPanel
    * DrawingPanel contains all the shapes
    */
   private class DrawingPanel extends JPanel{
      public DrawingPanel() {
         this.setPreferredSize(new Dimension(400, 400));
         this.setBackground(Color.pink);
      
      }

      /** paintComponent method paint Graphics object of shapes on the DrawingPanel */
   
      public void paintComponent(Graphics g){
         super.paintComponent(g);
         for(Shape shape: shapes){
            shape.display(g);
         }
         
      }
   
   }

   /** ButtonListener class implments ActionListener interface
    * ButtonListener class listen to evens and emit actions accordingly
    */
   private class ButtonListener implements ActionListener{
      public void actionPerformed(ActionEvent ae) {
                             
         if(ae.getSource() == timer){
            for(Shape shape: shapes){
               shape.move();
            }
         
         } else {
            JButton button = (JButton) ae.getSource();
            
            
         
            if(button.getText().equals("Circle")){
               shapes.add(new Circle());
               showNum.setText(Integer.toString(shapes.size()));
                            
            }
            
            if(button.getText().equals("Square")){
              shapes.add(new Square());
              showNum.setText(Integer.toString(shapes.size()));
            }
            
            if(button.getText().equals("Oval")){
              shapes.add(new Oval());
              showNum.setText(Integer.toString(shapes.size()));

              
            }
             if(button.getText().equals("Smiley")){
              shapes.add(new Smiley());
              showNum.setText(Integer.toString(shapes.size()));

              
            }

            
            
         
         
                 
         
            if(button.getText().equals("Stop")){
               timer.stop();
            }
         
            if(button.getText().equals("Start")){
            
               timer.start();
            }
         
         
         }
         
         
                   
         repaint();
      
      
         
         
      
      }
   }
}

