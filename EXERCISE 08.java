EXERCISE 8.1

 import java.applet.Applet;

 import java.awt.*;

 public class HelloApplet extends Applet {
     public void init() {
         setBackground(Color.WHITE);
     }
     public void paint(Graphics g) {
         g.setColor(Color.BLUE);
         g.drawString("Welcome to SCSVMV", 30, 25);
         g.setColor(Color.RED);
         g.fillOval(30, 45, 60, 60);
         g.setColor(Color.GREEN);
         g.fillRect(110, 45, 80, 60);
     }
 }

EXERCISE 8.2

import java.applet.Applet;
 import java.awt.*;
 import java.awt.event.*;

 public class Palette extends Applet {
     Color[] c = { Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW };
     int sel = 0;

     public void init() {
         addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent e) {
                 int i = (e.getX() - 20) / 60;
                 if (e.getY() < 60 && i >= 0 && i < 4) sel = i;
                 repaint();
             }
         });
     }
     public void paint(Graphics g) {
         for (int i = 0; i < c.length; i++) {
             g.setColor(c[i]);
             g.fillRect(20 + i * 60, 20, 50, 40);
         }
         g.setColor(c[sel]);
         g.fillRect(20, 90, 230, 60);
     }
 }

Palette.html
 <html><body>
   <applet code="Palette.class" width="290" height="180"></applet>
 </body></html>
