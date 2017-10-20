package lab1;

<<<<<<< HEAD
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
=======
import java.util.List;
import java.io.File;
import java.awt.*;
import javax.imageio.*;
import javax.swing.*;
import java.applet.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.*;
>>>>>>> 14bf1fedd7087446449aabe42d21b09e180d2724

public class DisplayGraph
{
	DisplayGraph(List<VNode> list)
	{
		String str = "";
		GraphViz gv = new GraphViz();
		gv.addln(gv.start_graph());
		for(VNode V : list)
		{
			ENode node = V.next;
			while(node != null)
			{
				str += (V.word).toString();
				str += " -> ";
				str += ((list.get(node.pos)).word).toString();
				gv.addln(str.toString());
				gv.addln("[label = " + node.weight + "]");
				gv.addln("[color = blue]");
				node = node.next;
				str = "";
			}
		}
		gv.addln(gv.end_graph());
		
		//System.out.println(gv.getDotSource());
		
	    String type = "jpg";
	    String representationType="dot";
	    File out = new File("out." + type);   // out.gif in this example
	    gv.writeGraphToFile( gv.getGraph(gv.getDotSource(), type, representationType), out );
	    
<<<<<<< HEAD
=======
	    ScrollPaneDemo S = new ScrollPaneDemo();
>>>>>>> 14bf1fedd7087446449aabe42d21b09e180d2724
	    
	    
	}
}


class ScrollPaneDemo extends JFrame implements MouseListener {
    ImagePanel jp;
    JScrollPane jsp;
    public ScrollPaneDemo() {
            super("JScrollPane Demo");
            jp = new ImagePanel();
            jp.setPreferredSize(new Dimension(600, 400));
            jsp = new JScrollPane(jp);
            jp.addMouseListener(this);
            getContentPane().add(jsp);
            setSize(640, 480);
            //setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
            //System.out.println("mouseClicked");
            jp.enlarge();
            jp.setPreferredSize(jp.getPreferredSize());
            jsp.validate();
    }
    public void mousePressed(MouseEvent e) {
            // System.out.println("mousePressed");
    }

    public void mouseReleased(MouseEvent e) {
            // System.out.println("mouseReleased");
    }
    public void mouseEntered(MouseEvent e) {
            // System.out.println("mouseEntered");
    }
    public void mouseExited(MouseEvent e) {
            // System.out.println("mouseExited");
    }
    public static void main(String[] args) {
            new ScrollPaneDemo();
    }
}
class ImagePanel extends JPanel {
    private Image image;
    private Dimension theSize = new Dimension(1800, 2400);
    public void setImage(Image image) {
            this.image = image;
            this.repaint();
    }
    public Image getImage() {
            return this.image;
    }
    public void paintComponent(Graphics g) {
<<<<<<< HEAD
            ImageIcon img = new ImageIcon("D:\\A_ruanjian\\Lab4\\out.jpg");
=======
            ImageIcon img = new ImageIcon("E:\\eclipse workplace\\Lab1GAI\\out.jpg");
>>>>>>> 14bf1fedd7087446449aabe42d21b09e180d2724
            g.drawImage(img.getImage(), 0, 0, theSize.width, theSize.height, null);
    }
    public void enlarge() {
            theSize.width = (theSize.width * 101) / 100;
            theSize.height = (theSize.height * 101) / 100;
            setSize(theSize);
    }        
    public Dimension getPreferredSize() {
            return this.theSize;
    }
}

