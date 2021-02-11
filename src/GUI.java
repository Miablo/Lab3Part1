import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

/**
 *
 */
public class GUI extends JPanel {
    int mar = 50;

    DrawGraph line = new DrawGraph();

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g1 = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        g1.draw(new Line2D.Double(mar, mar,mar,height-mar));
        g1.draw(new Line2D.Double(mar,height-mar, width-mar, height-mar));
        g1.setPaint(Color.BLUE);

    }

    void createWindow(){
        JFrame frame = new JFrame();
        frame.setTitle("Lab3 Part 1");
        setLayout(new GridLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new GUI());
        frame.setSize(400,400);
        frame.setLocation(200,200);
        frame.setVisible(true);

    }

}
