package projekt1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
    

public class Main extends JFrame {
    private Point startPoint;
    private Point endPoint;

    public Main() {
        setTitle("Line Drawing");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        JPanel canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, getWidth(), getHeight());
                
                if (startPoint != null && endPoint != null) {
                    g.setColor(Color.WHITE);
                    g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
                }
            }
        };
        
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startPoint = e.getPoint();
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                endPoint = e.getPoint();
                canvas.repaint();
            }
        });
        
        add(canvas);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main frame = new Main();
            frame.setVisible(true);
        });
    }
}

