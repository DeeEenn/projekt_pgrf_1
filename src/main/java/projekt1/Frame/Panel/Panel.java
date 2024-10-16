package projekt1.Frame.Panel;

import projekt1.Objekty.Line;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*  1. ZÁPOČTOVÝ PROJEKT PGRF  */
/*  CREATED BY DAVI  */

public class Panel extends JPanel {

    public Line currentLine;
    private int clickCount = 0;
    
    public Panel(){
        setBackground(Color.black);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                handleMouseClick(e);
            }
        });
    }

    private void handleMouseClick(MouseEvent e){
        if(clickCount == 0){
            currentLine = new Line(e.getX(), e.getY(), e.getX(), e.getY(), Color.WHITE);
            clickCount++;
        } else if (clickCount == 1) {
            currentLine.x2 = e.getX();
            currentLine.y2 = e.getY();
            clickCount = 0;
            repaint();
        }
    }
    
    public void rasterize(Graphics g) {
        if (currentLine != null) {
            currentLine.draw(g); 
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("Vykresli");
        rasterize(g); 

    }
}