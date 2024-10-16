package projekt1.Frame.Panel;

import javax.swing.*;

/*  1. ZÁPOČTOVÝ PROJEKT PGRF  */
/*  CREATED BY DAVI  */

public class Frame extends JFrame {
    
    Panel panel = new Panel();

    

    public Frame(){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("1. ZÁPOČTOVÝ PROJEKT | PGRF | NIČ DAVID");
        setSize(800, 550);
        add(panel);
    }

}
