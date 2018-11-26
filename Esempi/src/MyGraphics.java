import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class MyGraphics extends JComponent {

        private static final long serialVersionUID = 1L;

        MyGraphics() {
            setPreferredSize(new Dimension(500, 100));
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.fillRect(200, 62, 30, 10);
            g.setColor(Color.getHSBColor(10, 30, 2));
            g.drawArc(250, 250, 50, 50, 0, 360);
        }
    }
