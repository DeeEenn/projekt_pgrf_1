
package projekt1.Objekty;

import java.awt.Color;
import java.awt.Graphics;

/*  1. ZÁPOČTOVÝ PROJEKT PGRF  */
/*  CREATED BY DAVI  */

public class Line {
    public int x1, y1, x2, y2;
    private Color color;

    public Line(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }
}