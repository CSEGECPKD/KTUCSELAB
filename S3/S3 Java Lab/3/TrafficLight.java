import java.util.*;
import javax.swing.*;
import java.awt.event;

class Traffic_Lighaddt extends Jpanel implements ActionListener
{
    private JRadioButton r1,r2,r3;
    private color red_c1,green_c2,yellow_c3;
    Traffic_Light()
    {
        setBound(0,0,600,500);
        r1=new JRadioButton("Red");
        r2=new JRadioButton("green");
        r1=new JRadioButton("yellow");
        ButtonGroup group = new ButtonGroup();
        group.add(r1,r2,r3);
        add(r1,r2,r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
    }
    /**
     * This method is called when an action event occurs, such as a button click.
     * It updates the colors of the traffic lights based on the selected radio button.
     * If the first radio button is selected, the red light is turned on and the green and yellow lights are turned off.
     * If the second radio button is selected, the green light is turned on and the red and yellow lights are turned off.
     * If the third radio button is selected, the yellow light is turned on and the red and green lights are turned off.
     * Finally, it triggers a repaint to update the GUI.
     *
     * @param e the action event that occurred
     */
    /**
     * This method is called when an action event occurs, such as a button click.
     * It updates the colors of the traffic lights based on the selected radio button.
     * If the first radio button is selected, the red light is turned on and the green and yellow lights are turned off.
     * If the second radio button is selected, the green light is turned on and the red and yellow lights are turned off.
     * If the third radio button is selected, the yellow light is turned on and the red and green lights are turned off.
     * Finally, it triggers a repaint to update the GUI.
     *
     * @param e the action event that occurred
     */
    public void actionPerformed(ActionEvent e)
    {
        if(r1.isSelected()==true)
        {
            red_c1=color.red;
            green_c2=getBackground();
            yellow_c3=getBackground();
        }
        if(r2.isSelected()==true)
        {
            red_c1=getBackground();
            green_c2=color.green;
            yellow_c3=getBackground();
        }
        if(r3.isSelected()==true)
        {
            red_c1=getBackground();
            green_c2=getBackground();
            yellow_c3=color.yellow;
        }
        repaint();
    }
    public void paintComponent(Graphic g)
    {
        super.paintComponent(g);
        g.drawOval(50,50,50);
        g.drawOval(50,110,50);
        g.drawOval(50,170,50);
        f.setColor(red_c1);
        g.fillOval(50,50,50);
        g.setColor(green_c2);
        g.drawOval(50,110,50);
        g.setColor(yellow_c3);
        g.drawOval(50,170,50);


    }

}
class TrafficLight
{
    public static void main (String [] args)
    {
        JFrame f1 = new JFrame("Traffic Light ");
        f1.setVisible(true);
        f1.setSize(350,500);
        f1.setLayout(null);
        Traffic_Light t = new Traffic_Light();
        f1.add(t);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}